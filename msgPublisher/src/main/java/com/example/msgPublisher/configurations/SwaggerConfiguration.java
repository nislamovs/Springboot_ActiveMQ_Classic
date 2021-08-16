package com.example.msgPublisher.configurations;


import io.swagger.v3.core.converter.ModelConverters;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.webflux.core.converters.WebFluxSupportConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import java.net.URI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@Slf4j
@Configuration
public class SwaggerConfiguration {

  @Bean
  public OpenAPI customOpenAPI() {

    ModelConverters.getInstance().addConverter(new WebFluxSupportConverter());

    return new OpenAPI()
        .components(new Components()
//            .addSecuritySchemes("JWE", new SecurityScheme()
//                .type(SecurityScheme.Type.HTTP)
//                .scheme("bearer")
//                .bearerFormat("JWE"))
        ).info(new Info()
            .contact(
                new Contact()
                    .name("Nizami Islamovs")
                    .email("nizami.islamovs@gmail.com")
                    .url("https://github.com/nislamovs")
            ).description("This is AMQ classic message producer api swagger page")
            .version("1.0.0")
            .license(
                new License()
                    .name("Bullshit licence")
                    .url("No url :)")
            ).title("Product API")
        );
  }

  @Bean
  RouterFunction<ServerResponse> routerFunction() {
    return  route(GET("/"), req ->
        ServerResponse.temporaryRedirect(URI.create("/swagger-ui-custom.html"))
            .build());
  }
}
