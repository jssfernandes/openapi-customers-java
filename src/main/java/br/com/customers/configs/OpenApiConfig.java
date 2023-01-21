package br.com.customers.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "${info.app.name}",
        description = "This is a sample Customer API based on the OpenAPI 3.0", version = "${info.app.version}"))
public class OpenApiConfig {}
