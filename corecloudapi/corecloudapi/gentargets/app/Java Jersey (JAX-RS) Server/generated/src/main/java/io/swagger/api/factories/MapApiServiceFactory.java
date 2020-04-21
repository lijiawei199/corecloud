package io.swagger.api.factories;

import io.swagger.api.MapApiService;
import io.swagger.api.impl.MapApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class MapApiServiceFactory {
    private final static MapApiService service = new MapApiServiceImpl();

    public static MapApiService getMapApi() {
        return service;
    }
}
