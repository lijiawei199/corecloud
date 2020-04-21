package io.swagger.api.factories;

import io.swagger.api.ContractApiService;
import io.swagger.api.impl.ContractApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-20T10:14:08.259+08:00")
public class ContractApiServiceFactory {
    private final static ContractApiService service = new ContractApiServiceImpl();

    public static ContractApiService getContractApi() {
        return service;
    }
}
