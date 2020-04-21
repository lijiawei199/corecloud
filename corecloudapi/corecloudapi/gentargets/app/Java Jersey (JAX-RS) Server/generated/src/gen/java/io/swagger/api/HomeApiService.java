package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Equiplist;
import io.swagger.model.Myindex;
import io.swagger.model.Search;
import io.swagger.model.Todaymsg;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public abstract class HomeApiService {
    public abstract Response myindex(SecurityContext securityContext) throws NotFoundException;
    public abstract Response remind( @NotNull Integer type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response search( @NotNull String name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response todaymsg(SecurityContext securityContext) throws NotFoundException;
}
