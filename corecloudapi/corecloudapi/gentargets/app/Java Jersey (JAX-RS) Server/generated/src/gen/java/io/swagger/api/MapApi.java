package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MapApiService;
import io.swagger.api.factories.MapApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Cleanerlist;
import io.swagger.model.Elevatordetail;
import io.swagger.model.Equipdetail;
import io.swagger.model.Equiplist;
import io.swagger.model.Guardlist;
import io.swagger.model.Hotchart;
import io.swagger.model.Monitordetail;
import io.swagger.model.StoreList;
import io.swagger.model.StoreList1;

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

@Path("/map")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the map API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class MapApi  {
   private final MapApiService delegate;

   public MapApi(@Context ServletConfig servletContext) {
      MapApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MapApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MapApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MapApiServiceFactory.getMapApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/cleanerlist")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "获取清洁员工列表", response = Cleanerlist.class, tags={ "地图页数据交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Cleanerlist.class) })
    public Response cleanerlist(@ApiParam(value = "",required=true) @QueryParam("floor") String floor
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cleanerlist(floor,securityContext);
    }
    @GET
    @Path("/elevatordetail")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "获取地图页电梯信息", response = Elevatordetail.class, tags={ "地图页数据交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Elevatordetail.class) })
    public Response elevatordetail(@ApiParam(value = "",required=true) @QueryParam("type") Integer type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.elevatordetail(type,securityContext);
    }
    @GET
    @Path("/equipdetail")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "获取地图页设备信息", response = Equipdetail.class, tags={ "地图页数据交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Equipdetail.class) })
    public Response equipdetail(@ApiParam(value = "",required=true) @QueryParam("fid") String fid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.equipdetail(fid,securityContext);
    }
    @GET
    @Path("/equiplist")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "获取地图页设备列表 安防 600004  出入口200001    扶梯200003 直梯200004", response = Equiplist.class, tags={ "地图页数据交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Equiplist.class) })
    public Response equiplist(@ApiParam(value = "",required=true) @QueryParam("type") Integer type
,@ApiParam(value = "",required=true) @QueryParam("floor") String floor
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.equiplist(type,floor,securityContext);
    }
    @GET
    @Path("/guardlist")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "获取保安员工列表", response = Guardlist.class, tags={ "地图页数据交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Guardlist.class) })
    public Response guardlist(@ApiParam(value = "",required=true) @QueryParam("floor") String floor
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.guardlist(floor,securityContext);
    }
    @GET
    @Path("/hotchart")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "获取地图页热力图数据 0(客流) 1(坪效)", response = Hotchart.class, tags={ "地图页数据交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Hotchart.class) })
    public Response hotchart(@ApiParam(value = "",required=true) @QueryParam("type") Integer type
,@ApiParam(value = "",required=true) @QueryParam("floor") Integer floor
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.hotchart(type,floor,securityContext);
    }
    @GET
    @Path("/monitordetail")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "获取地图页监控信息", response = Monitordetail.class, tags={ "地图页数据交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Monitordetail.class) })
    public Response monitordetail(@ApiParam(value = "",required=true) @QueryParam("type") Integer type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.monitordetail(type,securityContext);
    }
    @GET
    @Path("/recognizeretail")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "获取地图页监控信息", response = Elevatordetail.class, tags={ "地图页数据交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Elevatordetail.class) })
    public Response recognizeretail(@ApiParam(value = "",required=true) @QueryParam("type") Integer type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.recognizeretail(type,securityContext);
    }
    @GET
    @Path("/storelist")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "获取地图店铺列表", response = StoreList1.class, tags={ "地图页数据交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = StoreList1.class) })
    public Response storelist(@ApiParam(value = "",required=true) @QueryParam("type") Integer type
,@ApiParam(value = "",required=true) @QueryParam("floor") String floor
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storelist(type,floor,securityContext);
    }
    @GET
    @Path("/totalData")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "地图页数据交互", response = StoreList.class, tags={ "地图页数据交互", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = StoreList.class) })
    public Response totalData(@ApiParam(value = "",required=true) @QueryParam("floor") String floor
,@ApiParam(value = "0 客流量 1 销售额 2 坪效 3 集客力",required=true) @QueryParam("type") String type
,@ApiParam(value = "-1表示无区分 0 日 1月 2 年",required=true) @QueryParam("time") String time
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.totalData(floor,type,time,securityContext);
    }
}
