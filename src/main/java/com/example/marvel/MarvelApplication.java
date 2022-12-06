package com.example.marvel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MarvelApplication {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/add").allowedOrigins("http://localhost:3000");
                registry.addMapping("/update/**").allowedOrigins("http://localhost:3000");
                registry.addMapping("/delete/**").allowedOrigins("http://localhost:3000");
                registry.addMapping("/findAll").allowedOrigins("http://localhost:3000");
                registry.addMapping("/**").allowedOrigins("*").allowedMethods("PUT", "DELETE", "GET", "POST");
            }
        };
    }
	public static void main(String[] args) {
		SpringApplication.run(MarvelApplication.class, args);
	}

}
