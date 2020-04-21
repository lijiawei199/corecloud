package com.bananalab.corecloud.mythread;

import com.bananalab.corecloud.util.EmailUtils;
import io.github.biezhi.ome.SendMailException;

import java.util.List;

/**
 * @author: 李文龙
 * @create: 2019-12-02 16:19
 * @description:
 **/
public class MailThread extends Thread {

    private EmailUtils emailUtils = new EmailUtils();

    private List<String> mails;
    private String username;
    private String companyName;
    private String phone;

    @Override
    public void run() {
        try {
            for (String mail : mails) {
                emailUtils.sendCode(mail, username, companyName, phone);
            }
        } catch (SendMailException e) {
            e.printStackTrace();
        }
    }

    public void setMails(List<String> mails) {
        this.mails = mails;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

