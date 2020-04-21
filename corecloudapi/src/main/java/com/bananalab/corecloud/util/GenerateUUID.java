package com.bananalab.corecloud.util;

import org.apache.commons.lang3.StringUtils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;

public class GenerateUUID {

    /**
     * 随机获取UUID字符串(无中划线)
     *
     * @return UUID字符串
     */
    public static String getUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid.substring(0, 8) + uuid.substring(9, 13) + uuid.substring(14, 18) + uuid.substring(19, 23)
                + uuid.substring(24);
    }

    public static Long getCurrentTimeID() {
        return System.currentTimeMillis() - 1505055408716L;
    }

    public static String getCurrentTimeMillisID() {
        return Long.toString(System.currentTimeMillis());
    }

    public static String get36NanoTimeID() {
        // 用36进制数压缩
        return Long.toString(System.nanoTime(), 36);
    }

    public static long getNanoTime() {
        return System.nanoTime();
    }

    public static long getNanoTimeHash() {
        return ((Long) System.nanoTime()).hashCode();
    }

    public static String getUserfriendlySecureRandom() {

        try {
            long nextLong = SecureRandom.getInstance("SHA1PRNG").nextLong();
            String string = Long.toUnsignedString(nextLong, 20);
            string = StringUtils.reverse(string);
            string = StringUtils.replaceChars(string, "0123456789abcdefghij", "234679QWERTYUPADFGHX");
            return string.substring(0, 8);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;

    }
}
