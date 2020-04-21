package com.bananalab.corecloud.util;

import java.math.BigDecimal;

/**
 * @author: 李文龙
 * @create: 2019-06-13 15:02
 * @description: 地图相关工具类
 **/
public class MapUtils {
    // 地球半径
    private static double EARTH_RADIUS = 6378.137;

    // 将用角度表示的角转换为近似相等的用弧度表示的角 Math.toRadians
    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     * 谷歌地图计算两个坐标点的距离
     *
     * @param lng1 经度1
     * @param lat1 纬度1
     * @param lng2 经度2
     * @param lat2 纬度2
     * @return 距离（千米）
     */
    public static double getDistance(String lng1, String lat1, String lng2, String lat2) {
        Double lng1D = Double.valueOf(lng1);
        Double lat1D = Double.valueOf(lat1);
        Double lng2D = Double.valueOf(lng2);
        Double lat2D = Double.valueOf(lat2);

        double radLat1 = Math.toRadians(lat1D);
        double radLat2 = Math.toRadians(lat2D);
        double a = radLat1 - radLat2;
        double b = Math.toRadians(lng1D) - Math.toRadians(lng2D);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) +
                Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
//        s = Math.round(s * 10000) / 10000;

        BigDecimal bigDecimal = new BigDecimal(s);
        return bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        double dist = getDistance("116.526444", "39.904787", "116.52396", "39.904342");
        System.out.println("两点相距：" + dist + "千米");
        if (dist < 1) {
            System.out.println("两点相距：" + dist + "千米");
        }
    }
}

