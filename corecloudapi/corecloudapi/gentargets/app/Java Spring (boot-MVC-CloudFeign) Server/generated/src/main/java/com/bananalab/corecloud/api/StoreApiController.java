package com.bananalab.corecloud.api;

import com.bananalab.corecloud.api.model.Capital;
import com.bananalab.corecloud.api.model.Potcustlist;
import com.bananalab.corecloud.api.model.Ranklist;
import com.bananalab.corecloud.api.model.StoreCunsume;
import com.bananalab.corecloud.api.model.StoreList;
import com.bananalab.corecloud.api.model.Storedetails;
import com.bananalab.corecloud.api.model.Translist;
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
public class StoreApiController implements StoreApi {

    private final StoreApiDelegate delegate;

    public StoreApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) StoreApiDelegate delegate) {
        this.delegate = delegate;
    }

    public ResponseEntity<Capital> capital(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "month", required = true) Integer month) {
        return delegate.capital(month);
    }

    public ResponseEntity<StoreCunsume> cunsume(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "fid", required = true) String fid) {
        return delegate.cunsume(fid);
    }

    public ResponseEntity<StoreList> leaseTime(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "floor", required = true) Integer floor) {
        return delegate.leaseTime(floor);
    }

    public ResponseEntity<Potcustlist> potcustlist(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "fid", required = true) String fid) {
        return delegate.potcustlist(fid);
    }

    public ResponseEntity<Ranklist> ranklist(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "priority", required = true) String priority,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "time", required = true) String time) {
        return delegate.ranklist(priority, time);
    }

    public ResponseEntity<StoreList> rent(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "floor", required = true) Integer floor) {
        return delegate.rent(floor);
    }

    public ResponseEntity<StoreList> storeCunsumeList(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "floor", required = true) String floor) {
        return delegate.storeCunsumeList(floor);
    }

    public ResponseEntity<Storedetails> storedetails(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "fid", required = true) String fid) {
        return delegate.storedetails(fid);
    }

    public ResponseEntity<StoreList> storeuser(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "floor", required = true) Integer floor) {
        return delegate.storeuser(floor);
    }

    public ResponseEntity<Translist> translist(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "time", required = true) String time) {
        return delegate.translist(time);
    }

}
