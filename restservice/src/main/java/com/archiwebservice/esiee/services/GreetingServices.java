package com.archiwebservice.esiee.services;

import com.archiwebservice.esiee.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing greetings.
 */
@Service
public interface GreetingServices {
    List<Greeting> getAllGreeting();

    Optional<Greeting> getGreetingById(Long id);

    Greeting createGreeting(Greeting greeting);

    Optional<Greeting> updateGreeting(Long id, Greeting greetingDetain);

    boolean deleteGreeting(Long id);


}


