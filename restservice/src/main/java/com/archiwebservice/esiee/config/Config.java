package com.archiwebservice.esiee.config;

import com.archiwebservice.esiee.model.Greeting;
import com.archiwebservice.esiee.services.GreetingServicesImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class Config {
    @Bean
    CommandLineRunner commandLineRunner(GreetingServicesImpl greetingServicesImpl) {
        return args -> {
            greetingServicesImpl.createGreeting(new Greeting("pavel"));
            greetingServicesImpl.createGreeting(new Greeting("Alipio"));
            greetingServicesImpl.createGreeting(new Greeting("Killyan"));
            greetingServicesImpl.createGreeting(new Greeting("Nicolas"));
            greetingServicesImpl.createGreeting(new Greeting("Anaïs"));
            greetingServicesImpl.createGreeting(new Greeting("Edouard"));
            greetingServicesImpl.createGreeting(new Greeting("George"));
        };
    }
}
