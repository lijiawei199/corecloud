package com.bananalab.corecloud.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 类名：WxpayBankUtils
 * 功能：微信支付银行公用工具类
 * 日期：2015-01-07
 */
public class WxpayBankUtils {
    public static String convertCodeToName(String bank_type) {
        if (StringUtils.isNotBlank(bank_type)) {
            if (bank_type.equals("ICBC_DEBIT")) {
                return "工商银行(借记卡)";
            } else if (bank_type.equals("ICBC_CREDIT")) {
                return "工商银行(信用卡)";
            } else if (bank_type.equals("ABC_DEBIT")) {
                return "农业银行(借记卡)";
            } else if (bank_type.equals("ABC_CREDIT")) {
                return "农业银行(信用卡)";
            } else if (bank_type.equals("PSBC_DEBIT")) {
                return "邮政储蓄银行(借记卡)";
            } else if (bank_type.equals("PSBC_CREDIT")) {
                return "邮政储蓄银行(信用卡)";
            } else if (bank_type.equals("CCB_DEBIT")) {
                return "建设银行(借记卡)";
            } else if (bank_type.equals("CCB_CREDIT")) {
                return "建设银行(信用卡)";
            } else if (bank_type.equals("CMB_DEBIT")) {
                return "招商银行(借记卡)";
            } else if (bank_type.equals("CMB_CREDIT")) {
                return "招商银行(信用卡)";
            } else if (bank_type.equals("BOC_DEBIT")) {
                return "中国银行(借记卡)";
            } else if (bank_type.equals("BOC_CREDIT")) {
                return "中国银行(信用卡)";
            } else if (bank_type.equals("COMM_DEBIT")) {
                return "交通银行(借记卡)";
            } else if (bank_type.equals("COMM_CREDIT")) {
                return "交通银行(信用卡)";
            } else if (bank_type.equals("CFT")) {
                return "零钱";
            } else if (bank_type.equals("LQT")) {
                return "零钱通";
            } else {
                return bank_type;
            }
        }
        return "";
    }
}
