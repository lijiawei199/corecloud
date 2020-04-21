package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.StoreApiService;
import io.swagger.api.factories.StoreApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Potcustlist;
import io.swagger.model.Ranklist;
import io.swagger.model.StoreCunsume;
import io.swagger.model.StoreList;
import io.swagger.model.Storedetails;
import io.swagger.model.Translist;

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

@Path("/store")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the store API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class StoreApi  {
   private final StoreApiService delegate;

   public StoreApi(@Context ServletConfig servletContext) {
      StoreApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("StoreApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (StoreApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = StoreApiServiceFactory.getStoreApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/cunsume")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "店铺能源消费", response = StoreCunsume.class, tags={ "店铺信息交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = StoreCunsume.class) })
    public Response cunsume(@ApiParam(value = "",required=true) @QueryParam("time") String time
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cunsume(time,securityContext);
    }
    @GET
    @Path("/leaseTime")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "店铺租约划分", response = StoreList.class, tags={ "店铺租约划分", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = StoreList.class) })
    public Response leaseTime(@ApiParam(value = "",required=true) @QueryParam("floor") Integer floor
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.leaseTime(floor,securityContext);
    }
    @GET
    @Path("/pot_cust")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "店铺意向客户列表", response = Potcustlist.class, tags={ "店铺信息交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Potcustlist.class) })
    public Response potcustlist(@ApiParam(value = "",required=true) @QueryParam("fid") String fid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.potcustlist(fid,securityContext);
    }
    @GET
    @Path("/ranklist")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "店铺排行列表", response = Ranklist.class, tags={ "店铺信息交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Ranklist.class) })
    public Response ranklist(@ApiParam(value = "",required=true) @QueryParam("priority") String priority
,@ApiParam(value = "",required=true) @QueryParam("time") String time
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ranklist(priority,time,securityContext);
    }
    @GET
    @Path("/rent")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "店铺月租划分", response = StoreList.class, tags={ "店铺月租划分", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = StoreList.class) })
    public Response rent(@ApiParam(value = "",required=true) @QueryParam("floor") Integer floor
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.rent(floor,securityContext);
    }
    @GET
    @Path("/details")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "获取店铺详情", response = Storedetails.class, tags={ "店铺信息交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Storedetails.class) })
    public Response storedetails(@ApiParam(value = "",required=true) @QueryParam("fid") String fid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storedetails(fid,securityContext);
    }
    @GET
    @Path("/used")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "店铺出租情况", response = StoreList.class, tags={ "店铺出租情况", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = StoreList.class) })
    public Response storeuser(@ApiParam(value = "",required=true) @QueryParam("floor") Integer floor
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storeuser(floor,securityContext);
    }
    @GET
    @Path("/translist")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "店铺转化率排行", response = Translist.class, tags={ "店铺信息交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Translist.class) })
    public Response translist(@ApiParam(value = "",required=true) @QueryParam("time") String time
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.translist(time,securityContext);
    }
}
