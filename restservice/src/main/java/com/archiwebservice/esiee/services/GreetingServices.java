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

    /**
     * Retrieves all greetings.
     *
     * @return a list of all greetings
     */
    List<Greeting> getAllGreeting();

    /**
     * Retrieves a greeting by its ID.
     *
     * @param id the ID of the greeting
     * @return an Optional containing the greeting if found, or empty if not found
     */
    Optional<Greeting> getGreetingById(Long id);

    /**
     * Creates a new greeting.
     *
     * @param greeting the greeting to create
     * @return the created greeting
     */
    Greeting createGreeting(Greeting greeting);

    /**
     * Updates an existing greeting.
     *
     * @param id the ID of the greeting to update
     * @param greetingDetail the new details of the greeting
     * @return an Optional containing the updated greeting if found, or empty if not found
     */
    Optional<Greeting> updateGreeting(Long id, Greeting greetingDetail);

    /**
     * Deletes a greeting by its ID.
     *
     * @param id the ID of the greeting to delete
     * @return true if the greeting was deleted, false if the greeting was not found
     */
    boolean deleteGreeting(Long id);
}