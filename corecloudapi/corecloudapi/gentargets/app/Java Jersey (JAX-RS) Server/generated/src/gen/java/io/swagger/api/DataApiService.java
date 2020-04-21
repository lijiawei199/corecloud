package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Brandlist;
import io.swagger.model.Equiplist;
import io.swagger.model.Flowtop5;
import io.swagger.model.Flowtrend;
import io.swagger.model.Flowview;
import io.swagger.model.Formatdistri;
import io.swagger.model.Formatratio;
import io.swagger.model.Kpitrend;
import io.swagger.model.Kpiview;
import io.swagger.model.Marketflowcompare;
import io.swagger.model.Storetflowcompare;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public abstract class DataApiService {
    public abstract Response brandlist( @NotNull String format, @NotNull String floor, @NotNull Integer page,SecurityContext securityContext) throws NotFoundException;
    public abstract Response flowtop5(SecurityContext securityContext) throws NotFoundException;
    public abstract Response flowtrend( @NotNull Integer timerange, @NotNull String data, @NotNull String fid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response flowview(SecurityContext securityContext) throws NotFoundException;
    public abstract Response formatdistri(SecurityContext securityContext) throws NotFoundException;
    public abstract Response formatratio(SecurityContext securityContext) throws NotFoundException;
    public abstract Response kpitrend(SecurityContext securityContext) throws NotFoundException;
    public abstract Response kpiview( @NotNull String _this, @NotNull String last,SecurityContext securityContext) throws NotFoundException;
    public abstract Response marketflowcompare( @NotNull String startDate, @NotNull String startTime,SecurityContext securityContext) throws NotFoundException;
    public abstract Response nownotify(SecurityContext securityContext) throws NotFoundException;
    public abstract Response storetflowcompare( @NotNull String floor, @NotNull String renge, @NotNull String date,SecurityContext securityContext) throws NotFoundException;
}
