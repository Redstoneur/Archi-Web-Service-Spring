package com.archiwebservice.esiee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main class for the ArchiApplication Spring Boot application.
 * This class contains the main method which serves as the entry point for the application.
 */
@SpringBootApplication
public class ArchiApplication {

    /**
     * The main method which serves as the entry point for the Spring Boot application.
     *
     * @param args Command line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(ArchiApplication.class, args);
    }

}