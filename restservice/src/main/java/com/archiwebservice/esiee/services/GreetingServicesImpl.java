package com.archiwebservice.esiee.services;

import com.archiwebservice.esiee.model.Greeting;
import com.archiwebservice.esiee.respository.GreetingRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing greetings.
 */
@Service
public class GreetingServicesImpl implements GreetingServices {

    @Autowired
    private GreetingRespository greetingRespository;

    /**
     * Retrieves all greetings.
     *
     * @return a list of all greetings
     */
    @Override
    public List<Greeting> getAllGreeting() {
        return greetingRespository.findAll();
    }

    /**
     * Retrieves a greeting by its ID.
     *
     * @param id the ID of the greeting
     * @return an Optional containing the greeting if found, or empty if not found
     */
    @Override
    public Optional<Greeting> getGreetingById(Long id) {
        return greetingRespository.findById(id);
    }

    /**
     * Creates a new greeting.
     *
     * @param greeting the greeting to create
     * @return the created greeting
     */
    @Override
    public Greeting createGreeting(Greeting greeting) {
        return greetingRespository.save(greeting);
    }

    /**
     * Updates an existing greeting.
     *
     * @param id the ID of the greeting to update
     * @param greetingDetail the new details of the greeting
     * @return an Optional containing the updated greeting if found, or empty if not found
     */
    @Override
    public Optional<Greeting> updateGreeting(Long id, Greeting greetingDetail) {
        return greetingRespository.findById(id).map(greeting -> {
            greeting.setContent(greetingDetail.getContent());
            return greetingRespository.save(greeting);
        });
    }

    /**
     * Deletes a greeting by its ID.
     *
     * @param id the ID of the greeting to delete
     * @return true if the greeting was deleted, false if the greeting was not found
     */
    @Override
    public boolean deleteGreeting(Long id) {
        if (greetingRespository.existsById(id)) {
            greetingRespository.deleteById(id);
            return true;
        }
        return false;
    }
}