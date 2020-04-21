package com.bananalab.corecloud.api;

import com.bananalab.corecloud.api.model.Cleanerlist;
import com.bananalab.corecloud.api.model.Elevatordetail;
import com.bananalab.corecloud.api.model.Equipdetail;
import com.bananalab.corecloud.api.model.Equiplist;
import com.bananalab.corecloud.api.model.Guardlist;
import com.bananalab.corecloud.api.model.Hotchart;
import com.bananalab.corecloud.api.model.Monitordetail;
import com.bananalab.corecloud.api.model.StoreList;
import com.bananalab.corecloud.api.model.StoreList1;
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
public class MapApiController implements MapApi {

    private final MapApiDelegate delegate;

    public MapApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) MapApiDelegate delegate) {
        this.delegate = delegate;
    }

    public ResponseEntity<Cleanerlist> cleanerlist(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "floor", required = true) String floor) {
        return delegate.cleanerlist(floor);
    }

    public ResponseEntity<Elevatordetail> elevatordetail(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "type", required = true) Integer type) {
        return delegate.elevatordetail(type);
    }

    public ResponseEntity<Equipdetail> equipdetail(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "fid", required = true) String fid) {
        return delegate.equipdetail(fid);
    }

    public ResponseEntity<Equiplist> equiplist(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "type", required = true) Integer type,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "floor", required = true) String floor) {
        return delegate.equiplist(type, floor);
    }

    public ResponseEntity<Guardlist> guardlist(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "floor", required = true) String floor) {
        return delegate.guardlist(floor);
    }

    public ResponseEntity<Hotchart> hotchart(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "type", required = true) Integer type,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "floor", required = true) Integer floor) {
        return delegate.hotchart(type, floor);
    }

    public ResponseEntity<Monitordetail> monitordetail(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "type", required = true) Integer type) {
        return delegate.monitordetail(type);
    }

    public ResponseEntity<Elevatordetail> recognizeretail(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "type", required = true) Integer type) {
        return delegate.recognizeretail(type);
    }

    public ResponseEntity<StoreList1> storelist(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "type", required = true) Integer type,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "floor", required = true) String floor) {
        return delegate.storelist(type, floor);
    }

    public ResponseEntity<StoreList> totalData(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "floor", required = true) String floor,@NotNull @ApiParam(value = "0 客流量 1 销售额 2 坪效 3 集客力", required = true) @Valid @RequestParam(value = "type", required = true) String type,@NotNull @ApiParam(value = "-1表示无区分 0 日 1月 2 年", required = true) @Valid @RequestParam(value = "time", required = true) String time) {
        return delegate.totalData(floor, type, time);
    }

}
