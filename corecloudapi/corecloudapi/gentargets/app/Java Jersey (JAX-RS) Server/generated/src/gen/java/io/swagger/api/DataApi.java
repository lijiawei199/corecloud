package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DataApiService;
import io.swagger.api.factories.DataApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/data")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the data API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class DataApi  {
   private final DataApiService delegate;

   public DataApi(@Context ServletConfig servletContext) {
      DataApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DataApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DataApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = DataApiServiceFactory.getDataApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/brandlist")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "品牌列表", response = Brandlist.class, tags={ "数据看板", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Brandlist.class) })
    public Response brandlist(@ApiParam(value = "业态",required=true) @QueryParam("format") String format
,@ApiParam(value = "",required=true) @QueryParam("floor") String floor
,@ApiParam(value = "第几页",required=true) @QueryParam("page") Integer page
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.brandlist(format,floor,page,securityContext);
    }
    @GET
    @Path("/flowtop5")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "客流量TOP5", response = Flowtop5.class, tags={ "数据看板", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Flowtop5.class) })
    public Response flowtop5(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.flowtop5(securityContext);
    }
    @GET
    @Path("/flowtrend")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "流量趋势（流量概览页下半部分）", response = Flowtrend.class, tags={ "数据看板", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Flowtrend.class) })
    public Response flowtrend(@ApiParam(value = "0 1 2（周|月|年）",required=true) @QueryParam("timerange") Integer timerange
,@ApiParam(value = "sale|flow||plateau|collect|value|trans",required=true) @QueryParam("data") String data
,@ApiParam(value = "fid",required=true) @QueryParam("fid") String fid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.flowtrend(timerange,data,fid,securityContext);
    }
    @GET
    @Path("/flowview")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "流量概览页上半部分", response = Flowview.class, tags={ "数据看板", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Flowview.class) })
    public Response flowview(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.flowview(securityContext);
    }
    @GET
    @Path("/formatdistri")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "业态分布", response = Formatdistri.class, tags={ "数据看板", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Formatdistri.class) })
    public Response formatdistri(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.formatdistri(securityContext);
    }
    @GET
    @Path("/formatratio")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "获取业态占比", response = Formatratio.class, tags={ "数据看板", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Formatratio.class) })
    public Response formatratio(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.formatratio(securityContext);
    }
    @GET
    @Path("/kpitrend")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "kpi趋势 返回数据 0 1 2 3 (客流量|平均集客力|销售额|平均坪效)", response = Kpitrend.class, tags={ "数据看板", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Kpitrend.class) })
    public Response kpitrend(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.kpitrend(securityContext);
    }
    @GET
    @Path("/kpiview")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "kpi概览", response = Kpiview.class, tags={ "数据看板", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Kpiview.class) })
    public Response kpiview(@ApiParam(value = "当次时间",required=true) @QueryParam("this") String _this
,@ApiParam(value = "上次时间",required=true) @QueryParam("last") String last
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.kpiview(_this,last,securityContext);
    }
    @GET
    @Path("/marketflowcompare")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "商场流量对比", response = Marketflowcompare.class, tags={ "数据看板", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Marketflowcompare.class) })
    public Response marketflowcompare(@ApiParam(value = "开始时间",required=true) @QueryParam("startDate") String startDate
,@ApiParam(value = "结束时间",required=true) @QueryParam("startTime") String startTime
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.marketflowcompare(startDate,startTime,securityContext);
    }
    @GET
    @Path("/nownotify")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "当前提示（实时消息中的消息喇叭）", response = Equiplist.class, tags={ "数据看板", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Equiplist.class) })
    public Response nownotify(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.nownotify(securityContext);
    }
    @GET
    @Path("/storetflowcompare")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "商铺流量对比", response = Storetflowcompare.class, tags={ "数据看板", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Storetflowcompare.class) })
    public Response storetflowcompare(@ApiParam(value = "",required=true) @QueryParam("floor") String floor
,@ApiParam(value = "",required=true) @QueryParam("renge") String renge
,@ApiParam(value = "",required=true) @QueryParam("date") String date
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storetflowcompare(floor,renge,date,securityContext);
    }
}
