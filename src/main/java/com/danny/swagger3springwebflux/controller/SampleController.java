package com.danny.swagger3springwebflux.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SampleController {
    @ApiOperation(value = "GET SAMPLE")
    @GetMapping("/sample")
    public Mono<SampleDto> getSample() {
        return Mono.just(new SampleDto(1, "danny"));
    }

    @ApiOperation(value = "POST SAMPLE")
    @PostMapping("/sample")
    public Mono<SampleDto> postSample(@RequestBody SampleDto requestSampleDto) {
        return Mono.just(requestSampleDto);
    }
}
