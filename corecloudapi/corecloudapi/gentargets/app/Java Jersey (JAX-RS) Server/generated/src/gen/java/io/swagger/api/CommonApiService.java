package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.BaseVO;
import java.io.File;
import io.swagger.model.FileUploadVOInfo;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public abstract class CommonApiService {
    public abstract Response sendvcode( @NotNull String phone,SecurityContext securityContext) throws NotFoundException;
    public abstract Response uploadByteFile(byte[] file,SecurityContext securityContext) throws NotFoundException;
    public abstract Response uploadFile(InputStream fileInputStream, FormDataContentDisposition fileDetail,SecurityContext securityContext) throws NotFoundException;
}
