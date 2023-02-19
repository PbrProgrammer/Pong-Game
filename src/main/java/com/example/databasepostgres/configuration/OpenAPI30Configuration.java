package com.example.databasepostgres.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@OpenAPIDefinition(info = @Info(title = "Game Manager API", version = "v1" , description = "Game Manager"))
public class OpenAPI30Configuration implements WebMvcConfigurer {

    public OpenAPI30Configuration() {
    }

//    @Bean
//    public OpenAPI customizeOpenAPI() {
//        String securitySchemeName = "bearer Authorization";
//        return (new OpenAPI()).addSecurityItem((new SecurityRequirement())
//                .addList("bearer Authorization")).components((new Components())
//                .addSecuritySchemes("bearer Authorization", (new SecurityScheme()).name("bearer Authorization")
//                        .type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")));
//    }

}
