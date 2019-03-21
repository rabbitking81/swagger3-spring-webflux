package com.danny.swagger3springwebflux.functional;

import com.danny.swagger3springwebflux.controller.SampleDto;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

//@Component
public class SampleFunctionalHandler {
    public Mono<ServerResponse> getFunctionalSample(ServerRequest request) {
        return ServerResponse.ok().body(Mono.just(new SampleDto(100, "danny")), SampleDto.class);
    }
}
