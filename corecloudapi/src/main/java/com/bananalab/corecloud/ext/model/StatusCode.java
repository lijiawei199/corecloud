package com.bananalab.corecloud.ext.model;

/**
 * @ Author     ：李文龙
 * @ Date       ：Created in 2019/4/10 17:04
 * @ Description：
 * @ Modified By：
 **/
public class StatusCode {
    // 成功
    public static final int OK = 200;
    // 客户端参数错误
    public static final int CLIENTERROR = 400;
    // 用户验证失败
    public static final int UNAUTHORIZED = 401;
    // 验证码错误
    public static final int CHECKCODE_ERROR = 402;
    // 无效用户
    public static final int FORBIDDEN = 403;
    // 服务端错误
    public static final int SERVERERROR = 500;
}
