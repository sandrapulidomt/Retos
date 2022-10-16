package Reto3y4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@EntityScan(basePackages = {"Reto3y4.Controlador"})  // scan JPA entities
@SpringBootApplication
public class Reto3y4Application {

    public static void main(String[] args) {
        SpringApplication.run(Reto3y4Application.class, args);
    }

}
