package com.archiwebservice.esiee.controller;

import com.archiwebservice.esiee.services.GreetingServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greeting")
public class GreetingController {

    public final GreetingServices greetingServices;


    public GreetingController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }
}
