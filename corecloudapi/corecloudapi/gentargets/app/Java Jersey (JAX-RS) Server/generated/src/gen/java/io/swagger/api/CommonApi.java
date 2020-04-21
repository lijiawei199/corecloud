package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CommonApiService;
import io.swagger.api.factories.CommonApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.BaseVO;
import java.io.File;
import io.swagger.model.FileUploadVOInfo;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/common")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the common API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class CommonApi  {
   private final CommonApiService delegate;

   public CommonApi(@Context ServletConfig servletContext) {
      CommonApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CommonApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CommonApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = CommonApiServiceFactory.getCommonApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/sms")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "短信服务", response = BaseVO.class, tags={ "公共接口", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = BaseVO.class) })
    public Response sendvcode(@ApiParam(value = "",required=true) @QueryParam("phone") String phone
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sendvcode(phone,securityContext);
    }
    @POST
    @Path("/byteFileUpload")
    @Consumes({ "application/octet-stream" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "byte文件上传", response = FileUploadVOInfo.class, tags={ "公共接口", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = FileUploadVOInfo.class) })
    public Response uploadByteFile(@ApiParam(value = "" ) byte[] file
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.uploadByteFile(file,securityContext);
    }
    @POST
    @Path("/fileUpload")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "文件上传", response = FileUploadVOInfo.class, tags={ "公共接口", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = FileUploadVOInfo.class) })
    public Response uploadFile(
            @FormDataParam("file") InputStream fileInputStream,
            @FormDataParam("file") FormDataContentDisposition fileDetail
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.uploadFile(fileInputStream, fileDetail,securityContext);
    }
}
