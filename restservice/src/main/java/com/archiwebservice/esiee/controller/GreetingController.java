package com.archiwebservice.esiee.controller;

import com.archiwebservice.esiee.model.Greeting;
import com.archiwebservice.esiee.services.GreetingServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for handling greeting-related requests.
 */
@RestController
@RequestMapping("api/v1/")
public class GreetingController {

    private final GreetingServicesImpl greetingServices;

    /**
     * Constructs a new GreetingController with the specified GreetingServices.
     *
     * @param greetingServices The service used for managing greetings.
     */
    @Autowired
    public GreetingController(GreetingServicesImpl greetingServices) {
        this.greetingServices = greetingServices;
    }

    /**
     * Handles requests to the /hello endpoint.
     *
     * @return A string containing the greeting message.
     */
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    /**
     * Handles GET requests to the /greetings endpoint.
     *
     * @return A list of all greetings.
     */
    @GetMapping("/greetings")
    public List<Greeting> getGreetings() {
        return greetingServices.getAllGreeting();
    }

    /**
     * Handles GET requests to the /greeting/{id} endpoint.
     *
     * @param id The ID of the greeting to retrieve.
     * @return An Optional containing the greeting if found, or empty if not found.
     */
    @GetMapping("/greeting/{id}")
    public Optional<Greeting> getGreetingById(@PathVariable("id") Long id) {
        return greetingServices.getGreetingById(id);
    }

    /**
     * Handles POST requests to the /greetings endpoint.
     *
     * @param greeting The greeting to create.
     */
    @PostMapping("/greetings")
    public void registerNewGreeting(@RequestBody Greeting greeting) {
        greetingServices.createGreeting(greeting);
    }

    /**
     * Handles PUT requests to the /greetings/{id} endpoint.
     *
     * @param id       The ID of the greeting to update.
     * @param greeting The updated greeting data.
     */
    @PutMapping("/greetings/{id}")
    public void updateGreeting(
            @PathVariable("id") Long id,
            @RequestBody(required = false) Greeting greeting) {
        greetingServices.updateGreeting(id, greeting);
    }

    /**
     * Handles DELETE requests to the /greetings/{id} endpoint.
     *
     * @param id The ID of the greeting to delete.
     */
    @DeleteMapping("/greetings/{id}")
    public void deleteGreeting(@PathVariable("id") Long id) {
        greetingServices.deleteGreeting(id);
    }
}