package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ContractApiService;
import io.swagger.api.factories.ContractApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;

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

@Path("/contract")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the contract API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class ContractApi  {
   private final ContractApiService delegate;

   public ContractApi(@Context ServletConfig servletContext) {
      ContractApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ContractApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ContractApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ContractApiServiceFactory.getContractApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "获取合同文件", response = File.class, tags={ "获取合同文件", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "success", response = File.class) })
    public Response getContractFiles(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getContractFiles(securityContext);
    }
}
