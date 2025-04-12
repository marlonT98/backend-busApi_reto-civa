package com.marlon.busapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class CorsConfig {


    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // permite todas las rutas
                        .allowedOrigins("http://localhost:5173") // frontend
                        .allowedMethods("*") // GET, POST, PUT, DELETE, etc
                        .allowedHeaders("*")
                        .allowCredentials(true); // necesario si usas autenticación
            }
        };
    }











}
