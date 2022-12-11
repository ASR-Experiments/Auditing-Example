package com.asr.personal.auditing.example.additional.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.OAuthFlow;
import io.swagger.v3.oas.annotations.security.OAuthFlows;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
    info = @Info(
        title = "Auditing Example",
        version = "0.0.1-SNAPSHOT",
        description = "Project to demonstrate the Caching in a Spring-boot Application"),
    security = {
        @SecurityRequirement(name = "api_key")
    }
)
@SecurityScheme(
    type = SecuritySchemeType.OAUTH2,
    name = "api_key",
    in = SecuritySchemeIn.HEADER,
    flows = @OAuthFlows(
        password = @OAuthFlow(
            authorizationUrl = "${auth.issuer.url}",
            tokenUrl = "${auth.login.url}",
            refreshUrl = "${auth.login.url}"
        )
    ))
public class OpenApiConfig {
}
