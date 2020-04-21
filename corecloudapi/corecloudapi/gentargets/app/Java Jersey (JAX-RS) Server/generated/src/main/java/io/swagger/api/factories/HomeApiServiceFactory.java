package io.swagger.api.factories;

import io.swagger.api.HomeApiService;
import io.swagger.api.impl.HomeApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class HomeApiServiceFactory {
    private final static HomeApiService service = new HomeApiServiceImpl();

    public static HomeApiService getHomeApi() {
        return service;
    }
}
