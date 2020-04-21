package com.bananalab.corecloud.util;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;
import com.bananalab.corecloud.controller.Constants;
import com.bananalab.corecloud.ext.model.StatusCode;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SpringUtil extends ResponseEntity implements ApplicationContextAware {

    /**
     * 当前IOC
     */
    private static ApplicationContext applicationContext;

    public SpringUtil(HttpStatus status) {
        super(status);
    }


    @Override
    public void setApplicationContext(ApplicationContext arg0)
            throws BeansException {
        applicationContext = arg0;
    }

    //获取ioc容器上下文
    public static Object getObject(String id) {
        Object object = null;
        object = applicationContext.getBean(id);
        return object;
    }

    public static String[] getNullPropertyNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<String>();
        for (java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }

    public static void copyPropertiesIgnoreNull(Object src, Object target) {

        BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
        Class myCalss = src.getClass();
        Field[] fs = myCalss.getDeclaredFields();// 获取PrivateClass所有属性
        for (int i = 0; i < fs.length; i++) {
            fs[i].setAccessible(true);// 将目标属性设置为可以访问
        }
        System.out.println(fs.length);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy,MM,dd,HH,mm");
        Arrays.stream(fs)
                .forEach(srcField -> {
                            try {
                                Field targetField = target.getClass().getDeclaredField(srcField.getName());
                                targetField.setAccessible(true);
                                //对没有赋值的type进行额外的操作
                                if (targetField.get(target) == null || targetField.get(target).equals("")) {
//                                     对时间的转换处理
                                    if (srcField.getName().toLowerCase().contains("time")) {
                                        Object obj = srcField.get(src);
                                        if (obj != "" && obj != null && srcField.getGenericType().toString().equals("class java.time.LocalDateTime")) {
                                            LocalDateTime localDateTime = (LocalDateTime) obj;
                                            Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
                                            targetField.set(target, dateFormat.format(date));
                                        }
                                    }
                                    if (targetField.getGenericType().toString().equals("class java.time.LocalDateTime")) {
                                        Object obj = srcField.get(src);
                                        System.out.println(obj);
                                        if (obj != "" && obj != null) {
                                            String time = (String) obj;
                                            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                                            LocalDateTime localDateTime = LocalDateTime.parse(time, df);
                                            targetField.set(target, localDateTime);
                                        }
                                        //对string类型的处理
                                    }
                                    if (targetField.getGenericType().toString().equals("class java.lang.String")) {
//                                    targetFieldClass.isInstance(String.class) 这个方法不好使
                                        // field.get(object o ) 这个方法是直接拿值 如果没有会出现空指针异常  所以 fieldget-> instance 或者 class==String.calss的思路都是行不通的
                                        Object obj = srcField.get(src);
                                        targetField.set(target, String.valueOf(obj));
                                    }


                                }
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            } catch (NoSuchFieldException e) {
                            }
                        }
                );
    }

    public static ResponseEntity respon(Object data, Object object) {
        Class myclass = data.getClass();
        try {
            Method setCode = myclass.getMethod("setCode", Integer.class);
            Field[] fs = myclass.getDeclaredFields();// 获取PrivateClass所有属性
            for (int i = 0; i < fs.length; i++) {
                fs[i].setAccessible(true);// 将目标属性设置为可以访问
            }
            Field innerData = myclass.getDeclaredField("data");
            Method setData = myclass.getMethod("setData", innerData.getType());
            setCode.invoke(data, StatusCode.OK);
            setData.invoke(data, object);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        BodyBuilder builder = ok();
        return builder.body(data);
    }

    public static ArrayList copyArrays(List originList, Object targetObject) {
        Class targetClass = targetObject.getClass();
        ArrayList targetList = new ArrayList();
        originList.forEach(element -> {
            try {
                Object target = targetClass.getConstructor().newInstance();
                SpringUtil.copyPropertiesIgnoreNull(element, target);
                targetList.add(target);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        });
        return targetList;
    }

    public static QueryWrapper eqWrapper(String column, String value) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(column, value);
        return wrapper;
    }

    public static String longitutde(double pos) {
        double min = pos - 0.01;//最小值
        double max = pos + 0.01;//总和
        int scl = 6;//小数最大位数
        int pow = (int) Math.pow(10, scl);//指定小数位
        double one = Math.floor((Math.random() * (max - min) + min) * pow) / pow;

        return String.valueOf(one);
    }

    public static String latitude(double pos) {
        double min = pos - 0.006;//最小值
        double max = pos + 0.006;//总和
        int scl = 6;//小数最大位数
        int pow = (int) Math.pow(10, scl);//指定小数位
        double one = Math.floor((Math.random() * (max - min) + min) * pow) / pow;

        return String.valueOf(one);
    }


    /**
     * 根据经纬度，计算两点间的距离
     *
     * @param longitude1 第一个点的经度
     * @param latitude1  第一个点的纬度
     * @param longitude2 第二个点的经度
     * @param latitude2  第二个点的纬度
     * @return 返回距离 单位千米
     */
    public static double getDistance(double latitude1, double longitude1, double latitude2, double longitude2) {
        final double EARTH_RADIUS = 6378.137;
        // 纬度
        double lat1 = Math.toRadians(latitude1);
        double lat2 = Math.toRadians(latitude2);
        // 经度
        double lng1 = Math.toRadians(longitude1);
        double lng2 = Math.toRadians(longitude2);
        // 纬度之差
        double a = lat1 - lat2;
        // 经度之差
        double b = lng1 - lng2;
        // 计算两点距离的公式
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(b / 2), 2)));
        // 弧长乘地球半径, 返回单位: 千米
        s = s * EARTH_RADIUS;
        return s;
    }

    public static String getImageByUrl(String imageurl, String name) {
        name = name + ".jpg";
        String savepath = System.getProperty("user.dir") + "\\img\\";
        System.out.println(savepath);
        try {
            // 构造URL
            URL url = new URL(imageurl);
            // 打开连接
            URLConnection con = url.openConnection();
            // 输入流
            InputStream is = con.getInputStream();
            // 1K的数据缓冲
            byte[] bs = new byte[1024];
            // 读取到的数据长度
            int len;
            File file = new File(savepath);// (String) property.get("ewmPath"));
            if (!file.exists()) {
                file.mkdirs();
            }
            // 输出的文件流
            OutputStream os = new FileOutputStream(savepath + name);
            // 开始读取
            while ((len = is.read(bs)) != -1) {
                os.write(bs, 0, len);
            }
            // 完毕，关闭所有链接
            os.close();
            is.close();
            System.out.println(file.getName());
            System.out.println(file.getPath());
            return savepath + name;
        } catch (Exception e) {
            return "error";
        }
    }

    public static String oss(OSSClient ossClient, File pic) {
        InputStream content = null;

        try {
            content = new FileInputStream(pic);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 创建上传Object的Metadata
        ObjectMetadata meta = new ObjectMetadata();
        // 必须设置ContentLength
        meta.setContentLength(pic.length());
        // 上传Object.
        String name = pic.getName();
        if (pic.getName().contains("pic")) {
            name = name.substring(8);
        }
        String key = "snowgod/" + name;
        ossClient.putObject("appshell", key, content, meta);
        return Constants.root_oss + "/" + key;
    }
    public static String yyyyMMdd() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        return simpleDateFormat.format(calendar.getTime());
    }
    public static String yyyyMMdd(Calendar calendar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(calendar.getTime());
    }
    public static String yyyyMM() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        Calendar calendar = Calendar.getInstance();
        return simpleDateFormat.format(calendar.getTime());
    }
    public static String yyyyMM(Calendar calendar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        return simpleDateFormat.format(calendar.getTime());
    }
    public static String yyyy() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        Calendar calendar = Calendar.getInstance();
        return simpleDateFormat.format(calendar.getTime());
    }
    public static String yyyy(Calendar calendar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        return simpleDateFormat.format(calendar.getTime());
    }
}



