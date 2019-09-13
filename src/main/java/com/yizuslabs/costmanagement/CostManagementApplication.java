package com.yizuslabs.costmanagement;

import com.yizuslabs.costmanagement.repository.UnidadNegocioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class CostManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CostManagementApplication.class, args);
    }


}