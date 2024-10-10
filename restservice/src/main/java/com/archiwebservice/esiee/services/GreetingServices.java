package com.archiwebservice.esiee.services;

import com.archiwebservice.esiee.respository.GreetingRespository;
import org.hibernate.internal.build.AllowNonPortable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServices {

        @Autowired
        public GreetingServices(GreetingRespository greetingRespository) {

        }

        public String hello() {
            return "Hello, World!";
        }
}
