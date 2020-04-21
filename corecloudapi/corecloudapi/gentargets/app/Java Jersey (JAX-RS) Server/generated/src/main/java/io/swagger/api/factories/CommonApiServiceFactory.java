package io.swagger.api.factories;

import io.swagger.api.CommonApiService;
import io.swagger.api.impl.CommonApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class CommonApiServiceFactory {
    private final static CommonApiService service = new CommonApiServiceImpl();

    public static CommonApiService getCommonApi() {
        return service;
    }
}
