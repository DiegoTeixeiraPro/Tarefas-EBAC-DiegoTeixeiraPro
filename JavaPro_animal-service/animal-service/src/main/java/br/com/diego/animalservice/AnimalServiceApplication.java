package br.com.diego.animalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controllers"})
public class AnimalServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnimalServiceApplication.class, args);
    }
}