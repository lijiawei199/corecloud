package com.bananalab.corecloud.api;

import com.bananalab.corecloud.api.model.Equiplist;
import com.bananalab.corecloud.api.model.Myindex;
import com.bananalab.corecloud.api.model.Search;
import com.bananalab.corecloud.api.model.Todaymsg;
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
public class HomeApiController implements HomeApi {

    private final HomeApiDelegate delegate;

    public HomeApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) HomeApiDelegate delegate) {
        this.delegate = delegate;
    }

    public ResponseEntity<Myindex> myindex() {
        return delegate.myindex();
    }

    public ResponseEntity<Equiplist> remind(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "type", required = true) Integer type) {
        return delegate.remind(type);
    }

    public ResponseEntity<Search> search(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "name", required = true) String name) {
        return delegate.search(name);
    }

    public ResponseEntity<Todaymsg> todaymsg() {
        return delegate.todaymsg();
    }

}
