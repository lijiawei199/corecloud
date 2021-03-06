/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (2.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bananalab.corecloud.api;

import com.bananalab.corecloud.api.model.BaseVO;
import com.bananalab.corecloud.api.model.FileUploadVOInfo;
import org.springframework.core.io.Resource;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

@Api(value = "common", description = "the common API")
public interface CommonApi {

    @ApiOperation(value = "", nickname = "sendvcode", notes = "短信服务", response = BaseVO.class, tags={ "公共接口", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = BaseVO.class) })
    @RequestMapping(value = "/common/sms",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<BaseVO> sendvcode(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "phone", required = true) String phone);


    @ApiOperation(value = "", nickname = "uploadByteFile", notes = "byte文件上传", response = FileUploadVOInfo.class, tags={ "公共接口", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = FileUploadVOInfo.class) })
    @RequestMapping(value = "/common/byteFileUpload",
        produces = { "application/json" }, 
        consumes = { "application/octet-stream" },
        method = RequestMethod.POST)
    ResponseEntity<FileUploadVOInfo> uploadByteFile(@ApiParam(value = ""  )  @Valid @RequestBody byte[] file);


    @ApiOperation(value = "", nickname = "uploadFile", notes = "文件上传", response = FileUploadVOInfo.class, tags={ "公共接口", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = FileUploadVOInfo.class) })
    @RequestMapping(value = "/common/fileUpload",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<FileUploadVOInfo> uploadFile(@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file);

}
