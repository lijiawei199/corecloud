package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Potcustlist;
import io.swagger.model.Ranklist;
import io.swagger.model.StoreCunsume;
import io.swagger.model.StoreList;
import io.swagger.model.Storedetails;
import io.swagger.model.Translist;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public abstract class StoreApiService {
    public abstract Response cunsume( @NotNull String time,SecurityContext securityContext) throws NotFoundException;
    public abstract Response leaseTime( @NotNull Integer floor,SecurityContext securityContext) throws NotFoundException;
    public abstract Response potcustlist( @NotNull String fid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response ranklist( @NotNull String priority, @NotNull String time,SecurityContext securityContext) throws NotFoundException;
    public abstract Response rent( @NotNull Integer floor,SecurityContext securityContext) throws NotFoundException;
    public abstract Response storedetails( @NotNull String fid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response storeuser( @NotNull Integer floor,SecurityContext securityContext) throws NotFoundException;
    public abstract Response translist( @NotNull String time,SecurityContext securityContext) throws NotFoundException;
}
