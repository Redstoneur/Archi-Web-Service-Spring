package com.archiwebservice.esiee.controller;

import com.archiwebservice.esiee.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greeting")
public class GreetingController {

        private final GreetingServices greetingServices;

        @Autowired
        public GreetingController(GreetingServices greetingServices) {
            this.greetingServices = greetingServices;
        }

        @RequestMapping("/hello")
        public String hello() {
            return "Hello, World!";
        }
}
