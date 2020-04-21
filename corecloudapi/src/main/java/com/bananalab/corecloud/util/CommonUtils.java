package com.bananalab.corecloud.util;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtils {
    public static final int DAY_MILLIS = 1000 * 60 * 60 * 24;

    public static final int ZONE_OFFSET_MILLIS = (DAY_MILLIS - (23 - Calendar.ZONE_OFFSET) * 3600000);

    /**
     * 获取百分比
     *
     * @param a
     * @param b
     * @return
     */
    public static String percent2(Long a, Long b) {
        if (b == 0) {
            return "暂无人打分 ";
        }
        double percent = (double) a / b;
        DecimalFormat format = new DecimalFormat("0.00%");
        String result = format.format(percent);
        return result;
    }

    /**
     * 获取百分比
     *
     * @param p1
     * @param p2
     * @return
     */
    public static String percent1(double p1, double p2) {
        if (p2 == 0) {
            return "暂无人打分 ";
        }
        String str;
        double p3 = p1 / p2;
        NumberFormat nf = NumberFormat.getPercentInstance();
        nf.setMinimumFractionDigits(2);
        str = nf.format(p3);
        return str;
    }

    /**
     * 获取百分比
     *
     * @param p1
     * @param p2
     * @return
     */
    public static String percent(double p1, double p2) {
        if (p2 == 0) {
            return "100%";
        }
        String str;
        double p3 = p1 / p2;
        NumberFormat nf = NumberFormat.getPercentInstance();
        nf.setMinimumFractionDigits(2);
        str = nf.format(p3);
        return str;
    }

    public static String numberToPercent(double n) {
        NumberFormat pi = NumberFormat.getPercentInstance();
        pi.setMinimumFractionDigits(2);

        return pi.format(n);

    }

    /**
     * 清零
     *
     * @param str 原始字符串
     * @return
     */
    public static String trim(String str) {
        if (str.indexOf(".") != -1 && str.charAt(str.length() - 1) == '0') {
            return trim(str.substring(0, str.length() - 1));
        } else {
            return str.charAt(str.length() - 1) == '.' ? str.substring(0, str.length() - 1) : str;
        }
    }

    public static String trimFloat(Float f) {
        String str = String.valueOf(f);
        return trim(str);
    }

    public static Date getTime() {

        Calendar cl = Calendar.getInstance();

        cl.setTime(new Date());

        Date date = cl.getTime();

        /*
         * ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         *
         * String dateTime = ft.format(date);
         */

        return date;

    }

    /**
     * 获取日期相差的天数
     *
     * @param d1
     * @param d2
     * @return
     */
    public static int compareToTwoDay(Date d1, Date d2) {
        return (int) ((d2.getTime() / (1000 * 24 * 60 * 60)) - (d1.getTime() / (1000 * 24 * 60 * 60)));
    }

    /**
     * 获取日期相差的天数
     *
     * @param d1
     * @param d2
     * @return
     */
    public static double compareToTwoDays(Date d1, Date d2) {
        return ((Double.valueOf(d2.getTime()) / (1000 * 24 * 60 * 60))
                - (Double.valueOf(d1.getTime()) / (1000 * 24 * 60 * 60)));
    }

    public static Date stringToDateFormat(String str) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = null;
        try {
            dt = (Date) ft.parseObject(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dt;
    }

    public static Date DateStrToDate(String str) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Date stringToDateFormat(String str, String separatorPattern) {
        SimpleDateFormat ft = null;
        switch (separatorPattern) {
            case "-":
                ft = new SimpleDateFormat("yyyy-MM-dd");
                break;
            case "/":
                ft = new SimpleDateFormat("yyyy/MM/dd");
                break;
            default:
                break;
        }
        Date dt = null;
        try {
            dt = (Date) ft.parseObject(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dt;
    }

    /**
     * 获取每个月最后一天
     *
     * @return
     */
    public static Date getLastDay(Date dt) {
        String s = getFirstDay(dt);
        Date d = stringToTimeFormat(s);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + 1);
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 1);
        String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar.getTime());
        return stringToTimeFormat(str);
    }

    public static Date addDay(Date dt, int day) {
        if (dt == null) {
            return new Date();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dt);
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + day);
        return calendar.getTime();
    }

    /**
     * 获取当前的分钟数
     *
     * @param dt
     */
    public static Date getPredictArrivalTimeDay(Date dt) {
        // long sub=(dt.getTime()-ZONE_OFFSET_MILLIS)%DAY_MILLIS;
        // long minute=sub/(long)(1000*60);
        // if(minute>0&&minute<=18*60){
        // return getPredictArrivalTimeDay(dt,7);
        // }else {
        // return getPredictArrivalTimeDay(dt,8);
        // }
        return getPredictArrivalTimeDay(dt, 7);
    }

    public static Date getPredictArrivalTimeDay(Date dt, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dt);

        int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if (week != 0) {// 如果不是周日就加一天（因为如果是其他天 生产日期会经过一个周日，周日厂房放假所以要加一天）
            day = day + 1;
        }
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + day);
        return calendar.getTime();
    }

    // public static void main(String[] args) {
    // // Calendar calendar=Calendar.getInstance();
    // // calendar.setTime(new Date());
    // // calendar.set(Calendar.DAY_OF_YEAR,
    // // calendar.get(Calendar.DAY_OF_YEAR)+1);
    // // System.out.println(dateToString(calendar.getTime()));
    //// Date d1 = stringToDateFormat("2015-04-01:23:59:59");
    //// Date d2 = stringToDateFormat("2015-5-20");
    //// Calendar calendar = Calendar.getInstance();
    //// calendar.setTime(d2);
    //// int a=calendar.get(Calendar.DAY_OF_WEEK);
    //// System.out.println(a);
    ////
    //// getPredictArrivalTimeDay(new Date());
    // DateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    // try {
    // Date d = dateFormat.parse("2016-07-17 00:00:00");
    // System.out.println(getDayBySubtraction(d, new Date()));
    // } catch (ParseException e) {
    // e.printStackTrace();
    // }
    //
    //// System.out.println(dateToString(getPredictArrivalTimeDay(d2, 1)));
    // }

    /**
     * 获取上一个月的最后一天
     *
     * @param dt
     * @return
     */
    public static Date getLastMonth(Date dt) {
        String s = getFirstDay(dt);
        Date d = stringToTimeFormat(s);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 1);
        String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar.getTime());
        return stringToTimeFormat(str);
    }

    public static String getLastDayByYearAndMonth(String date) {
        String s = getFirstDayByYearAndMonth(date);
        Date d = stringToTimeFormat(s);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + 1);
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 1);
        String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar.getTime());
        return str;
    }

    public static Date getFirstWeekOfDay(Date date, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getInitialDay(date));
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - day);
        return getInitialDay(calendar.getTime());
    }

    public static Date getLastWeekOfDay(Date date, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getInitialDay(date));
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - day + 1);
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 1);
        return calendar.getTime();
    }

    /**
     * 获取当前日期的凌晨时间
     *
     * @param dt
     * @return
     */
    public static Date getInitialDay(Date dt) {
        StringBuffer sb = new StringBuffer();
        sb.append(dateToYearAndMonth(dt)).append(" 00:00:00");
        return stringToTimeFormat(sb.toString());
    }

    /**
     * 获取每月第一天
     *
     * @param dt
     * @return
     */
    public static String getFirstDay(Date dt) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
        String s = df.format(dt);
        StringBuffer str = new StringBuffer().append(s).append("-01 00:00:00");
        return str.toString();
    }

    public static String getFirstDayByYearAndMonth(String date) {
        StringBuffer str = new StringBuffer().append(date).append("-01 00:00:00");
        return str.toString();
    }

    public static String getFirstDayByYearAndMonthInDateFormat(String date) {
        StringBuffer str = new StringBuffer().append(date).append("-01");
        return str.toString();
    }

    /**
     * 月份加法
     *
     * @param dt
     * @param month
     * @return
     */
    public static Date getDateByMonth(Date dt, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dt);
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + month);
        String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar.getTime());
        return stringToTimeFormat(str);
    }

    /**
     * 获取每个月第一天
     *
     * @param dt
     * @return
     */
    public static Date getFirstDay1(Date dt) {
        return stringToTimeFormat(getFirstDay(dt));
    }

    /**
     * 获取两个时间差的天数
     *
     * @param d1
     * @param d2
     * @return
     */
    public static int getDayBySubtraction(Date d1, Date d2) {
        long time = d1.getTime() - d2.getTime();
        int day = (int) (time / (1000 * 24 * 60 * 60));
        if (day < 0)
            day = 0;
        return day;
    }

    /**
     * 获取不同时间的月份差
     *
     * @param beginDate
     * @param endDate
     * @return
     */
    public static int getDiffMonth(Date beginDate, Date endDate) {
        Calendar calbegin = Calendar.getInstance();
        Calendar calend = Calendar.getInstance();
        calbegin.setTime(beginDate);
        calend.setTime(endDate);
        int m_begin = calbegin.get(Calendar.MONTH) + 1; // 获得合同开始日期月份
        int m_end = calend.get(Calendar.MONTH) + 1;
        // 获得结束日期月份
        int checkmonth = m_end - m_begin + (calend.get(Calendar.YEAR) - calbegin.get(Calendar.YEAR)) * 12;
        // 获得结束日期于开始的相差月份
        return checkmonth + 1;
    }

    /**
     * 判断是否同月
     *
     * @param beginDate
     * @param endDate
     * @return
     */
    public static boolean diffMonth(Date beginDate, Date endDate) {
        int checkmonth = getDiffMonth(beginDate, endDate);
        if (checkmonth > 0) {
            return true;
        }
        return false;
    }

    public static Date stringToTimeFormat(String str) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dt = null;
        try {
            dt = (Date) ft.parseObject(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dt;
    }

    /**
     * @param str
     * @param datePattern(yyyy-MM-dd HH:mm:ss或者yyyy/MM/dd HH:mm:ss)
     * @return
     * @Description: 根据不同的日期格式，转换成Date类型. datePattern格式举例(yyyy-MM-dd
     * HH:mm:ss或者yyyy/MM/dd HH:mm:ss)
     * @CreateOn: 2016年8月24日 下午2:30:26
     * @Author: heyunjun@udz.com
     * @Version: v1.0 修改历史: 修改人 修改日期 修改描述
     * <p>
     * -------------------------------------------
     */
    public static Date stringToTimeFormat(String str, String datePattern) {
        SimpleDateFormat ft = new SimpleDateFormat(datePattern);
        Date dt = null;
        try {
            dt = (Date) ft.parseObject(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dt;
    }

    public static String dateToMonth(Date dt) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM");
        String str = null;
        try {
            str = ft.format(dt);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return str;
    }

    public static String dateToYearAndMonth(Date dt) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String str = null;
        try {
            str = ft.format(dt);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return str;
    }

    public static Date stringToBirthday(String str) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = null;
        try {
            dt = (Date) ft.parseObject(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dt;
    }

    public static String birthdaysToString(Date dt) {

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String str = null;
        try {
            str = ft.format(dt);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return str;
    }

    public static String dateToString(Date dt) {
        if (dt == null)
            return null;
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = null;
        try {
            str = ft.format(dt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 自定义时间格式
     */
    public static String dateToString(Date dt, String style) {
        SimpleDateFormat ft = new SimpleDateFormat(style);
        String str = null;
        try {
            str = ft.format(dt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public static String creatNameByTime() {
        Date currTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddhhmmssS");
        return formatter.format(currTime);

    }

    public static String getFileType(String filename) {
        return filename.substring(filename.lastIndexOf("."));

    }

    /**
     * 获取当前时间至零时的毫秒数
     *
     * @return 返回当前时间至零时的毫秒数
     */
    public static long getCurrentTimeToZeroHour() {
        // 获取格式化后的当前日期
        Date currentDate = new Date();
        String formatCurrentDate = dateToYearAndMonth(currentDate);
        // 计算出当前日期的最后一秒时间
        Date zeroHour = stringToTimeFormat(formatCurrentDate + " 23:59:59");

        return zeroHour.getTime() + 1000 - currentDate.getTime();

    }

    /**
     * 把字符串类型的日期2011-06-27转化成如下格式： 06/27
     *
     * @param date
     * @return
     */
    public static String dutyDateToShortString(String date) {
        return date.substring(5, 7) + "/" + date.substring(8, 10);
    }

    /**
     * 把字符串类型的日期2011-06-27 00:00:00转化成如下格式2011-06-27
     *
     * @param date
     * @return
     */
    public static String dutyDateToString(String date) {
        return date.substring(0, 10);
    }

    /**
     * 把字符串类型的日期2011-06-27 10:00:30:0转化成如下格式2011-06-27 10:00:30
     *
     * @param date
     * @return
     */
    public static String standardDateToString(String date) {
        return date.substring(0, 19);
    }

    /**
     * 检查字符串是否为空或为null,可以使用StringUtils的 isblank方法
     *
     * @param para
     * @return
     * @author wuchuanbo
     */
    public static boolean checkParameter(String para) {
        if (para == null || "".equals(para.trim())) {
            return false;
        } else {
            return true;
        }
    }

    public static String getValidString(String v) {
        if (v == null || "".equals(v.trim())) {
            return "";
        } else {
            return v.trim();
        }
    }

    /**
     * get提交时中文转码，解决中文乱码
     *
     * @param para_iso8859_1
     * @return
     * @author wuchuanbo
     */
    public static String convertToUtf8(String para_iso8859_1) {
        if (para_iso8859_1 == null) {
            return null;
        }
        String para = "";
        try {
            para = new String(para_iso8859_1.getBytes("ISO8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return para;
    }

    /**
     * 生成一个介于start和end之间的随机数,生成的值包含start和end
     *
     * @param start
     * @param end
     * @return
     */
    public static int generateRandomValue(int start, int end) {
        Random rnd = new Random();
        int x = rnd.nextInt(end - start + 1);
        return start + x;
    }

    /**
     * LIST随机一个value
     *
     * @param list
     * @return
     */
    public static String getRandomValueByList(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int max = list.size() - 1;

        int randomIndex = generateRandomValue(0, max);

        return list.get(randomIndex);
    }

    /**
     * 截取固定长度的字符串（超过length的部分去掉，加“...”）
     *
     * @param content
     * @param length
     * @return
     * @author xiaozunsheng
     */
    public static String subString(String content, int length) {
        if (content == null) {
            return null;
        }
        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        if (p.matcher(content).replaceAll("zz").length() <= length) {
            return content;
        }
        for (int i = content.length(); i >= 0; i--) {
            String temp = content.substring(0, i);
            if (p.matcher(temp).replaceAll("zz").length() <= length - 3) {
                return temp + "...";
            }
        }
        return "";
    }

    /**
     * 在textare编辑器中编辑时，把HTML标记替换为转义字符。比如：编辑一个 "
     * <hr>
     * " 就会转义为"&lt;hr&gt;" 显示在页面的时候就会显示为
     * <hr>
     * ，而不是一条水平线
     *
     * @param content
     * @return
     * @author xiaozunsheng
     */
    public static String changeHtml(String content) {
        if (content == null) {
            return null;
        }
        content = content.replaceAll("&", "&amp;");
        content = content.replaceAll("<", "&lt;");
        content = content.replaceAll(">", "&gt;");
        content = content.replaceAll(" ", "&nbsp;");
        content = content.replaceAll("\n", "<br/>");
        return content;
    }

    /**
     * 把HTML转义字符转换成原始的字符。 比如把"&nbsp;"转换成" "。
     *
     * @param content
     * @return
     * @author wuzhiguang
     */
    public static String changeHtml2Original(String content) {
        if (content == null) {
            return null;
        }
        content = content.replaceAll("&amp;", "&");
        content = content.replaceAll("&lt;", "<");
        content = content.replaceAll("&gt;", ">");
        content = content.replaceAll("&nbsp;", " ");
        content = content.replaceAll("<br/>", "\n");
        return content;
    }

    /**
     * 一段HTML中是否包含 图片
     *
     * @param content
     * @return 0不包含图片 1包含图片
     * @author xiaozunsheng
     */
    public static int getImageFromHtml(String content) {
        if (content == null) {
            return 0;
        }
        Pattern p = Pattern.compile("<img.[^>]+[>]+", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(content);
        return m.find() ? 1 : 0;
    }

    /**
     * 将html转换成js
     *
     * @param html
     * @return
     * @author wangjunping
     */
    public static String htmltojs(String html, String divId) {
        html = html.replace("\"", "\\\"");
        html = html.replace("/", "\\/");
        if (html == null || html.trim().length() < 1) {
            return "document.getElementById(\"" + divId + "\").style.display='none';";
        }
        html = "document.getElementById(\"" + divId + "\").innerHTML=\"" + html + "\";";

        return html;
    }

    /**
     * 将html转换成js
     *
     * @param html
     * @return
     * @author wangjunping
     */
    public static String htmltojs(String html) {
        html = html.replace("\"", "\\\"");
        html = html.replace("/", "\\/");
        html = html.replaceAll("\t|\r|\n", "");// 去除字符串中的空格,回车,换行符,制表符
        html = "document.write(\"" + html + "\");";

        return html;
    }

    public static String htmltoscript(String html) {
        return ("<script language='javascript'>" + html + "</script>");
    }

    /**
     * <li>从给定的html文本剔除禁止的html标签
     *
     * <li>可以通过这里http://www.w3school.com.cn/tags/index.asp了解所有html标签
     *
     * <li>通常用在对ckeditor提交的文本进行过滤
     *
     * @param html   输入的html文本
     * @param option COMMON_FORBIDDEN_TAG禁止了最小的用户录入内容集合,可以继续设置禁止的标签
     * @return
     * @author outiejun
     */
    public static String filterHTMLTag(String html, String... option) {

        if (option.length == 0) {
            return html;
        }

        StringBuilder options = new StringBuilder();

        if (option.length != 1) {

            for (int i = 0; i < option.length; i++) {
                options.append(option[i]);
                if (i != option.length - 1) {
                    options.append("|");
                }
            }
        } else {
            options.append(option[0]);
        }

        Pattern p = Pattern.compile("<\\s*[/]*[^>]*\\s*(" + options + ")[/]*\\s*>", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(html);
        return m.replaceAll("");
    }

    /**
     * URL转码
     *
     * @param content
     * @return
     */
    public static String urlEncode(String content) {
        if (content == null)
            return null;
        try {
            // System.out.println("urlEncode begin：" + content + "...");
            content = URLEncoder.encode(content, "UTF-8");
            // System.out.println("urlEncode end：" + content + "...");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static String urlEncodeGBK(String content) {
        if (content == null)
            return null;
        try {
            // System.out.println("urlEncode begin：" + content + "...");
            content = URLEncoder.encode(content, "gbk");
            // System.out.println("urlEncode end：" + content + "...");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return content;
    }

    /**
     * URL解码
     *
     * @param content
     * @return
     */
    public static String urlDecode(String content) {
        if (content == null)
            return null;
        try {
            // System.out.println("urlDecode begin：" + content + "...");
            content = URLDecoder.decode(content, "UTF-8");
            // System.out.println("urlDecode end：" + content + "...");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static String urlDecodeGBK(String content) {
        if (content == null)
            return null;
        try {
            // System.out.println("urlDecode begin：" + content + "...");
            content = URLDecoder.decode(content, "gbk");
            // System.out.println("urlDecode end：" + content + "...");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return content;
    }

    /**
     * 禁止用户录入的最小html标签集合
     */
    public static final String COMMON_FORBIDDEN_TAG = "applet|area|base|basefont|body|button|form|frame|frameset|head|html|iframe|input|label|legend|map|menu|meta|noframes|noscript|optgroup|option|script|select|textarea|title";

    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    /**
     * 返回相差的毫秒
     *
     * @param bigger
     * @param smaller
     * @return
     */
    public static long diffTime(Date bigger, Date smaller) {
        return bigger.getTime() - smaller.getTime();
    }

    /**
     * 将一个map按照value排序
     *
     * @param map
     * @return
     */
    public static <K, V extends Comparable<? super V>> LinkedHashMap<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return -(o1.getValue()).compareTo(o2.getValue());
            }
        });

        LinkedHashMap<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static BigDecimal divide(int a, int b) {
        if (b == 0) {
            return new BigDecimal(0);
        }
        return new BigDecimal(a).setScale(2, BigDecimal.ROUND_HALF_DOWN)
                .divide(new BigDecimal(b).setScale(2, BigDecimal.ROUND_HALF_DOWN), 4, BigDecimal.ROUND_HALF_DOWN);
    }

    public static BigDecimal divide(BigDecimal a, BigDecimal b, MathContext type) {
        if (b == null || new BigDecimal(0).equals(b) || new BigDecimal(0).equals(a) || a == null) {
            return new BigDecimal(0);
        }
        return a.divide(b, type);
    }

    /**
     * 数组String转Long
     *
     * @return
     */
    public static Long[] StringtoLong(String str) {
        StringTokenizer toKenizer = new StringTokenizer(str, ",");
        List<Long> list = new ArrayList<>();
        while (toKenizer.hasMoreElements()) {
            list.add(Long.valueOf(toKenizer.nextToken()));
        }
        return (Long[]) list.toArray(new Long[0]);
    }

    public static <E> E getListByIndex(List<E> list, int index) {
        if (index < list.size()) {
            return (E) list.get(index);
        }
        return null;
    }

    /**
     * String[] 转 int[]
     *
     * @param stringArray
     * @return
     */
    public static Integer[] getIntArrayByStringArray(String[] stringArray) {
        Integer array[] = new Integer[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }
        return array;
    }

    public static boolean checkMask(int overlay, int mask) {
        return (overlay & mask) != 0;
    }

    /**
     * 随机生成字符串
     *
     * @param length
     * @return
     */
    public static String getRandomString(int length) { // length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
}
