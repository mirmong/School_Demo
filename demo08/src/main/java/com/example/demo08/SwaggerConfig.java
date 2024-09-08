package com.example.demo08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI()
				.components(new Components())
				.info(apiInfo());
	}
	
	private Info apiInfo() {
		return new Info()
				.title("Swagger 명세서")
				.description("Demo08 프로젝트의 REST API 설명")
				.version("1.0.0");
	}
}
