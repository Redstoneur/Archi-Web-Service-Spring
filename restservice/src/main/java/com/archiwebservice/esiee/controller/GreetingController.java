package com.archiwebservice.esiee.controller;

import com.archiwebservice.esiee.model.Greeting;
import com.archiwebservice.esiee.services.GreetingServices;
import com.archiwebservice.esiee.services.GreetingServicesImpl;
import org.aspectj.weaver.GeneratedReferenceTypeDelegate;
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

    @GetMapping("/greetings")
    public List<Greeting> getGreetings() {
        return greetingServices.getAllGreeting();
    }

    @GetMapping("/greeting/{id}")
    public Optional<Greeting> getGreetingById(@PathVariable("id") Long id) {
        return greetingServices.getGreetingById(id);
    }

    @PostMapping("/greetings")
    public void registerNewGreeting(@RequestBody Greeting greeting) {
        greetingServices.createGreeting(greeting);
    }

    @PutMapping("/greetings/{id}")
    public void updateGreeting(
            @PathVariable("id") Long id,
            @RequestBody(required = false) Greeting greeting) {
        greetingServices.updateGreeting(id, greeting);
    }

    @DeleteMapping("/greetings/{id}")
    public void deleteGreeting(@PathVariable("id") Long id) {
        greetingServices.deleteGreeting(id);
    }
}