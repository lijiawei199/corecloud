package com.bananalab.corecloud.ext.wxpay;

import com.github.wxpay.sdk.WXPayConfig;

import java.io.InputStream;

/**
 * @author: 李文龙
 * @create: 2019-05-15 16:25
 * @description: 微信支付相关
 * @program: hanchen_art_backstage
 **/
public class WxPayConfigImpl implements WXPayConfig {

    @Override
    public String getAppID() {
        return "wxcb21ad9c63feb66e";
    }

    @Override
    public String getMchID() {
        return "1534790621";
    }

    @Override
    public String getKey() {
        return "54ypk2YSto2eC4Tm8DJFnsjbqJpekp2d";
    }

    @Override
    public InputStream getCertStream() {
        return null;
    }

    @Override
    public int getHttpConnectTimeoutMs() {
        return 0;
    }

    @Override
    public int getHttpReadTimeoutMs() {
        return 0;
    }
}

