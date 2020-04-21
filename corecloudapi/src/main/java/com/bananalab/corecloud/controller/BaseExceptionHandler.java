package com.bananalab.corecloud.controller;

import com.bananalab.corecloud.api.model.BaseVO;
import com.bananalab.corecloud.ext.model.StatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 */
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntity error(Exception e) {
        e.printStackTrace();
        BaseVO baseVO = new BaseVO();
        baseVO.setCode(StatusCode.SERVERERROR);
        baseVO.setMsg(e.getMessage());
        return ResponseEntity.ok(baseVO);
    }
}
