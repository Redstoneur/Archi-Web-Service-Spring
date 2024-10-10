package com.archiwebservice.esiee.services;

import com.archiwebservice.esiee.model.Greeting;
import com.archiwebservice.esiee.respository.GreetingRespository;
import org.hibernate.internal.build.AllowNonPortable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing greetings.
 */
@Service
public class GreetingServices {

    private final GreetingRespository greetingRespository;

    /**
     * Constructs a new GreetingServices instance with the specified GreetingRespository.
     *
     * @param greetingRespository The repository used for accessing greeting data.
     */
    @Autowired
    public GreetingServices(GreetingRespository greetingRespository) {
        this.greetingRespository = greetingRespository;
    }

    /**
     * Retrieves a list of greetings by the specified ID.
     *
     * @param id The ID of the greetings to retrieve.
     * @return A list of Greeting objects.
     */
    public List<Greeting> getById(Long id) {
        return greetingRespository.findGreetingById(id);
    }

    /**
     * Returns a greeting message.
     *
     * @return A string containing the greeting message.
     */
    public String hello() {
        return "Hello, World!";
    }
}