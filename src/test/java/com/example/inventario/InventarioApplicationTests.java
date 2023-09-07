package com.example.inventario;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication

class InventarioApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);

	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOriginPatterns("*") // Patrón de origen permitido
						.allowedMethods("GET", "POST", "PUT", "DELETE")
						.allowCredentials(true);
			}
		};
	}


}
