package com.test.msib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main application class for the MSIB (Magang Singkat Independen Bersertifikat) application.
 * This class is annotated with @SpringBootApplication, which is a convenience annotation that
 * adds all of the following:
 *
 * - @Configuration
 * - @EnableAutoConfiguration
 * - @ComponentScan
 *
 * This class serves as the entry point for the Spring Boot application.
 *
 * @author user
 */
@SpringBootApplication
public class MsibApplication {

    /**
     * The main method that starts the Spring Boot application.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(MsibApplication.class, args);
    }

}