package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MarketApiService;
import io.swagger.api.factories.MarketApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/market")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the market API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class MarketApi  {
   private final MarketApiService delegate;

   public MarketApi(@Context ServletConfig servletContext) {
      MarketApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MarketApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MarketApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MarketApiServiceFactory.getMarketApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/capital")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "资本管理", response = Translist.class, tags={ "资本管理", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = Translist.class) })
    public Response capital(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.capital(securityContext);
    }
}
