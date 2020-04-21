package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Cleanerlist;
import io.swagger.model.Elevatordetail;
import io.swagger.model.Equipdetail;
import io.swagger.model.Equiplist;
import io.swagger.model.Guardlist;
import io.swagger.model.Hotchart;
import io.swagger.model.Monitordetail;
import io.swagger.model.StoreList;
import io.swagger.model.StoreList1;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public abstract class MapApiService {
    public abstract Response cleanerlist( @NotNull String floor,SecurityContext securityContext) throws NotFoundException;
    public abstract Response elevatordetail( @NotNull Integer type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response equipdetail( @NotNull String fid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response equiplist( @NotNull Integer type, @NotNull String floor,SecurityContext securityContext) throws NotFoundException;
    public abstract Response guardlist( @NotNull String floor,SecurityContext securityContext) throws NotFoundException;
    public abstract Response hotchart( @NotNull Integer type, @NotNull Integer floor,SecurityContext securityContext) throws NotFoundException;
    public abstract Response monitordetail( @NotNull Integer type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response recognizeretail( @NotNull Integer type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response storelist( @NotNull Integer type, @NotNull String floor,SecurityContext securityContext) throws NotFoundException;
    public abstract Response totalData( @NotNull String floor, @NotNull String type, @NotNull String time,SecurityContext securityContext) throws NotFoundException;
}
