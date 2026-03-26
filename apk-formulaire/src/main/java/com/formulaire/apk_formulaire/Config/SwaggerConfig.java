package com.formulaire.apk_formulaire.Config;


import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.*;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {

        return new OpenAPI()
                .info(new Info()
                        .title("Formulaire API")
                        .description("API pour gestion des utilisateurs")
                        .version("1.0"));
    }
}