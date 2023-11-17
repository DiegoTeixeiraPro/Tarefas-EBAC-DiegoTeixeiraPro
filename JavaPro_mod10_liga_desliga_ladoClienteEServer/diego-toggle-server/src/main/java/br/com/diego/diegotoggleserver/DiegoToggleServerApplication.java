package br.com.diego.diegotoggleserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DiegoToggleServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiegoToggleServerApplication.class, args);
    }
}