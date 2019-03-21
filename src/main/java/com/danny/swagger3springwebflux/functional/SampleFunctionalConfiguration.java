package com.danny.swagger3springwebflux.functional;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

//@Configuration
//@EnableWebFlux
public class SampleFunctionalConfiguration {
    @Bean
    public RouterFunction<ServerResponse> routes(SampleFunctionalHandler handler) {
        return RouterFunctions.route(GET("/func/sample"), handler::getFunctionalSample);
    }
}
