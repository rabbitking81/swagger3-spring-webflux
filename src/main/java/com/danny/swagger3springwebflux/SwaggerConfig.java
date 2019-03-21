package com.danny.swagger3springwebflux;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

import java.util.Optional;

//@Configuration
public class SwaggerConfig implements WebFluxConfigurer {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
            .build()
            .genericModelSubstitutes(Optional.class, Flux.class, Mono.class);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //swagger resource
        //I had to comment the below line for http://localhost:8080/swagger-ui.html to show up. Else i kept getting
        //"Failed to handle request [GET http://localhost:8080/swagger-ui.html]: Response status 404"
        //registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/swagger/**").addResourceLocations("classpath:/static/swagger/");
    }
}
