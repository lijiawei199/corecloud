package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.HomeApiService;
import io.swagger.api.factories.HomeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Equiplist;
import io.swagger.model.Myindex;
import io.swagger.model.Search;
import io.swagger.model.Todaymsg;

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

@Path("/home")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the home API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class HomeApi  {
   private final HomeApiService delegate;

   public HomeApi(@Context ServletConfig servletContext) {
      HomeApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("HomeApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (HomeApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = HomeApiServiceFactory.getHomeApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/index")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "主页展板", response = Myindex.class, tags={ "主页数据接口", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Myindex.class) })
    public Response myindex(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.myindex(securityContext);
    }
    @GET
    @Path("/remind")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "主页消息提醒", response = Equiplist.class, tags={ "主页数据接口", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Equiplist.class) })
    public Response remind(@ApiParam(value = "",required=true) @QueryParam("type") Integer type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.remind(type,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "地图搜索", response = Search.class, tags={ "地图搜索", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Search.class) })
    public Response search(@ApiParam(value = "",required=true) @QueryParam("name") String name
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.search(name,securityContext);
    }
    @GET
    @Path("/todaymsg")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "0(到期提醒) 1(客流消息) 2(销售消息) 3 保安 4 保洁", response = Todaymsg.class, tags={ "主页数据接口", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "0(到期提醒) 1(客流消息) 2(销售消息)  3 保安 4 保洁", response = Todaymsg.class) })
    public Response todaymsg(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.todaymsg(securityContext);
    }
}
