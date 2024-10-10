package com.archiwebservice.esiee.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServices {

    public final GreetingServices greetingServices;

    public GreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

}
