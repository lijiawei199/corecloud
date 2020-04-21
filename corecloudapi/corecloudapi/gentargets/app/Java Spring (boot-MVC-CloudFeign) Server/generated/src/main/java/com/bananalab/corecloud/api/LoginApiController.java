package com.bananalab.corecloud.api;

import com.bananalab.corecloud.api.model.UserVOInfo;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

@Controller
@RequestMapping("${openapi.Qpk API.base-path:/market}")
public class LoginApiController implements LoginApi {

    private final LoginApiDelegate delegate;

    public LoginApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) LoginApiDelegate delegate) {
        this.delegate = delegate;
    }

    public ResponseEntity<UserVOInfo> login(@ApiParam(value = "电话") @Valid @RequestParam(value = "phone", required = false) String phone,@ApiParam(value = "code") @Valid @RequestParam(value = "code", required = false) String code) {
        return delegate.login(phone, code);
    }

}
