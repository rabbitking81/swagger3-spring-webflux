package com.danny.swagger3springwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

@SpringBootApplication
@EnableSwagger2WebFlux
public class Swagger3SpringWebfluxApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Swagger3SpringWebfluxApplication.class);
        application.setWebApplicationType(WebApplicationType.REACTIVE);
        application.run(args);
    }

}

