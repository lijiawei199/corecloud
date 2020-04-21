package com.bananalab.corecloud.controller;

import com.bananalab.corecloud.api.LoginApiDelegate;
import com.bananalab.corecloud.api.model.UserVOInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class LoginController extends BaseDelegateImpl implements LoginApiDelegate {


    @Override
    public ResponseEntity<UserVOInfo> login(String phone, String code) {
        return null;
    }
}
