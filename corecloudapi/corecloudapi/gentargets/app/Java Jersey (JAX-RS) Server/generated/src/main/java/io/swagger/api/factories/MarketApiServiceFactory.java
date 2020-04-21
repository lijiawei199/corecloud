package io.swagger.api.factories;

import io.swagger.api.MarketApiService;
import io.swagger.api.impl.MarketApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class MarketApiServiceFactory {
    private final static MarketApiService service = new MarketApiServiceImpl();

    public static MarketApiService getMarketApi() {
        return service;
    }
}
