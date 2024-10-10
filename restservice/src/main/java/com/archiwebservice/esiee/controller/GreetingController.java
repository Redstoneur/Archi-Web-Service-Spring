package com.archiwebservice.esiee.controller;

import com.archiwebservice.esiee.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for handling greeting-related requests.
 */
@RestController
@RequestMapping("api/v1/greeting")
public class GreetingController {

    private final GreetingServices greetingServices;

    /**
     * Constructs a new GreetingController with the specified GreetingServices.
     *
     * @param greetingServices The service used for managing greetings.
     */
    @Autowired
    public GreetingController(GreetingServices greetingServices) {
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
}