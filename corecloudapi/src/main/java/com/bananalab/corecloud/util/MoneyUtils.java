package com.bananalab.corecloud.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author: 李文龙
 * @create: 2019-05-19 16:47
 * @description: 金钱的相关工具类
 * @program: hanchen_art_backstage
 **/
public class MoneyUtils {

    /**
     * 分转元，转换为bigDecimal在toString
     *
     * @return
     */
    public static String changeF2Y(int price) {
        return BigDecimal.valueOf(Long.valueOf(price)).divide(new BigDecimal(100)).toString();
    }

    /**
     * BigDecimal >> 分
     * @return
     */
    /**
     * BigDecimal取整数
     * <p>
     * ROUND_UP：非0时，舍弃小数后（整数部分）加1，比如12.49结果为13，-12.49结果为 -13
     * ROUND_DOWN：直接舍弃小数
     * ROUND_CEILING：如果 BigDecimal 是正的，则做 ROUND_UP 操作；如果为负，则做 ROUND_DOWN 操作 （一句话：取附近较大的整数）
     * ROUND_FLOOR: 如果 BigDecimal 是正的，则做 ROUND_DOWN 操作；如果为负，则做 ROUND_UP 操作（一句话：取附近较小的整数）
     * ROUND_HALF_UP：四舍五入（取更近的整数）
     * ROUND_HALF_DOWN：跟ROUND_HALF_UP 差别仅在于0.5时会向下取整
     * ROUND_HALF_EVEN：取最近的偶数
     * ROUND_UNNECESSARY：不需要取整，如果存在小数位，就抛ArithmeticException 异常
     *
     * @param price
     * @return
     */
    public static long convertLong(BigDecimal price) {
        long l = price.setScale(0, BigDecimal.ROUND_HALF_UP).longValue();
        return l;
    }

    /**
     * BigDecimal >> 分
     *
     * @return
     */
    public static long convertCent(BigDecimal price) {
        if (null == price) {
            return 0L;
        }

        BigDecimal bigDecimal = price.multiply(new BigDecimal(100));
        return bigDecimal.toBigInteger().longValue();
    }

    /**
     * 分 >> BigDecimal
     *
     * @return
     */
    public static BigDecimal convertCent(long price) {
        BigDecimal feeNo = new BigDecimal(price + "");
        feeNo = feeNo.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
        return feeNo;
    }
}

