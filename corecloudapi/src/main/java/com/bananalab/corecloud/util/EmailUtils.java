package com.bananalab.corecloud.util;

import io.github.biezhi.ome.OhMyEmail;
import io.github.biezhi.ome.SendMailException;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @author: 李文龙
 * @create: 2019-05-21 17:18
 * @description: 邮件发送工具类
 * @program:
 **/
@Component
public class EmailUtils {

    public void sendCode(String mail, String name, String companyName, String phone) throws SendMailException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.debug", "false");
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.timeout", "10000");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.host", "smtp.163.com");
        OhMyEmail.config(props, "wenlongup@163.com", "nalong1826487735");
        OhMyEmail.subject("官网客户咨询提醒")
                .from("BANANALAB")
                .to(mail)
                .html(html(name, companyName, phone))
                .send();
    }

    private String html(String name, String companyName, String phone) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table>");
        sb.append("<tr style='line-height: 40px'><td>有人提交咨询信息了</td></tr>");
        sb.append("<tr style='line-height: 40px'><td>姓名：" + name + "</td></tr>");
        sb.append("<tr style='line-height: 40px'><td>公司名：" + companyName + "</td></tr>");
        sb.append("<tr style='line-height: 40px'><td>手机号：" + phone + "</td></tr>");
        sb.append("</table>");
        return sb.toString();
    }
}

