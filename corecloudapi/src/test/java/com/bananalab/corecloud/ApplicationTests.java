package com.bananalab.corecloud;

import com.aliyun.oss.OSSClient;
import com.bananalab.corecloud.mybatis.mapper.StoreDataMapper;
import com.bananalab.corecloud.mybatis.model.MarketData;
import com.bananalab.corecloud.mybatis.model.Store;
import com.bananalab.corecloud.mybatis.model.StoreData;
import com.bananalab.corecloud.service.impl.*;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    private OSSClient ossClient;
    @Autowired
    private StoreServiceImpl storeService;
    @Autowired
    private TenantServiceImpl tenantService;
    @Autowired
    private CleanerServiceImpl cleanerService;
    @Autowired
    StoreDataServiceImpl storeDataService;
    @Autowired
    MarketDataServiceImpl marketDataService;
   @Autowired
   MarketFormatServiceImpl formatService;
   @Autowired
    StoreDataMapper storeDataMapper;


    private void insertregion() {
        List<Store> stores = storeService.list();
        int i = 13;
        int j = 12;
        int renum = 1;
        int num = 1;
        String region = "A";
        for (int i1 = 1; i1 < i; i1++) {
            for (int i2 = 0; i2 < j; i2++) {
                Store store = stores.get(num);
                store.setRegion(region + "-" + renum);
                num++;
                store.updateById();
            }
            if (num > 60) {
                region = "B";
            }
            renum++;

        }
    }
    @Test
    public void newInsertDate(){
    }
    //随机时间
        public static long random(long begin, long end) {
            long rtn = begin + (long) (Math.random() * (end - begin));
            // 如果返回的是开始时间和结束时间，则递归调用本函数查找随机值
            if (rtn == begin || rtn == end) {
                return random(begin, end);
            }
            return rtn;
        }
    private void insertDate() throws ParseException {
        List<Store> stores = storeService.list();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar start = Calendar.getInstance();
//        start.setTime(simpleDateFormat.parse("2020-01-25"));
        start.setTime(simpleDateFormat.parse("2020-03-25"));
        Random random = new Random();
        Calendar end = Calendar.getInstance();
//        end.setTime(simpleDateFormat.parse("2018-09-15"));
        end.setTime(simpleDateFormat.parse("2020-01-26"));
        ArrayList<String> strings = new ArrayList<>();
        while (end.getTime().compareTo(start.getTime()) < 0) {
            end.add(Calendar.DATE, 1);
            strings.add(simpleDateFormat.format(end.getTime()));

        }

        for (Store store : stores) {
            for (String string : strings) {
                StoreData storeData = new StoreData();
                storeData.setTime(LocalDate.parse(string));
                storeData.setFlow(random.nextInt(2200));
                storeData.setSale(random.nextInt(30000));
                storeData.setFid(store.getFid());
                storeData.insert();
                System.out.println(storeData);
            }
        }
    }
       //获取范围内所有时间
    private ArrayList<String> getRangeTime(String endTime,String startTime) throws  Exception{
        Calendar end = Calendar.getInstance();
        Calendar start = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse1 = simpleDateFormat.parse(startTime);
        Date parse = simpleDateFormat.parse(endTime);
        start.setTime(parse1);
        end.setTime(parse);
        ArrayList<String> strings = new ArrayList<>();
        while (end.getTime().before(start.getTime())) {
            end.add(Calendar.DAY_OF_YEAR, 1);
            String format = simpleDateFormat.format(end.getTime());
            StringBuilder stringBuilder = new StringBuilder(format);
           // stringBuilder.replace(10, 11, "T");
            strings.add(new String(stringBuilder));
        }
        return strings;
    }
   @Test
    public void insertSotreDare() throws ParseException {
        Random random=new Random();
        ArrayList<String> strings= null;
        try {
            strings = getRangeTime("2019-10-20","2020-06-26");
        } catch (Exception e) {
            e.printStackTrace();
        }
      List<Store> store=storeService.list();
       int i = 0;
       ArrayList<StoreData> storeDatas = new ArrayList<>();

       for (Store o : store) {
           for (String string : strings) {
               StoreData storeData = new StoreData();
               storeData.setElectric(random.nextInt()*10+10);
               storeData.setGas(random.nextInt()*20+10);
               storeData.setWater(random.nextInt()*5+3);
               storeData.setSale(random.nextInt()*3000+2000);
               storeData.setFid(o.getFid());
               storeData.setFlow(random.nextInt()*100+50);
               storeData.setTime(LocalDate.parse(string));
              storeDatas.add(storeData);
               i++;
               storeData.insert();
           }
//           if (storeDatas.size() == 1000) {
//               storeDataService.saveBatch(storeDatas);
//               storeDatas.clear();
//           }
       }
 //最后再清空剩余数据
//       storeDataService.saveBatch(storeDatas);

   }
@Test
 public  void updateheight(){
     for (int i = 0; i < 200; i++) {
         Store store=storeService.getById(i);
         if (store!=null){
             int beginIndex = store.getBuildUrl().lastIndexOf("/") + 1;
             String buildUrl = store.getBuildUrl().substring(beginIndex,beginIndex+1);
             switch (buildUrl){
                 case "1":
                     store.setLength(8.5);
                     store.setWidth(6.5);
                     break;
                 case "2":
                     store.setLength(10.5);
                     store.setWidth(7.5);
                     break;
                 case "3":
                     store.setLength(12.5);
                     store.setWidth(7.5);
                     break;
                 case "4":
                     store.setLength(7.5);
                     store.setWidth(5.5);
                     break;
                 case "5":
                     store.setLength(10.2);
                     store.setWidth(7.5);
                     break;
                 case "6":
                     store.setLength(16.4);
                     store.setWidth(10.2);
                     break;
                 case "7":
                     store.setLength(10.2);
                     store.setWidth(7.5);
                     break;
                 case "8":
                     store.setLength(16.4);
                     store.setWidth(6.3);
                     break;
                 case "9":
                     store.setLength(12.3);
                     store.setWidth(3.8);
                     break;
                 case "10":
                     store.setLength(12.3);
                     store.setWidth(3.8);
                     break;

             }
             store.setBuildUrl(store.getBuildUrl().replace("png","jpg"));
             store.setHeight(2.5);
             store.updateById();
         }


     }
 }
    private void altertable() throws ParseException {
        File file = new File("C:\\Users\\intel\\Desktop\\name.txt");
        BufferedReader reader = null;
        String content = null;
        int line = 1;
        StringBuilder stringBuilde = new StringBuilder();
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            while ((content = reader.readLine()) != null) {
                content = content.trim();
                stringBuilde.append(content).append("|");
                line++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public Date randomDate(String beginDate, String endDate) {
        //时间格式化
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //定义开始时间
        Date start = null;
        try {
            start = format.parse(beginDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //定义结束时间
        Date end = null;
        try {
            end = format.parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (start.getTime() >= end.getTime()) {
            return null;
        }

        long date = random(start.getTime(), end.getTime());
        return new Date(date);
    }








    private void insertflow() {
        QueryWrapper<Store> storeQueryWrapper = new QueryWrapper<>();
        storeQueryWrapper.isNotNull("fid");
        List<Store> stores = storeService.list(storeQueryWrapper);
        List<StoreData> storeDatas = new ArrayList<>();
        Random random = new Random();
        for (Store store : stores) {
            StoreData storeData = new StoreData();
            storeData.setFid(store.getFid());
            //年
            random.nextInt(100);
            storeData.setFlow(random.nextInt(1000) + 500);
//            storeData.setSalequote(random.nextInt(4000)+2000);
            //月

            Calendar calender = Calendar.getInstance();

        }
    }


}
