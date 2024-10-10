package com.archiwebservice.esiee.services;

import com.archiwebservice.esiee.model.Greeting;
import com.archiwebservice.esiee.respository.GreetingRespository;
import org.hibernate.internal.build.AllowNonPortable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServices {

        private final GreetingRespository greetingRespository;
        @Autowired
        public GreetingServices(GreetingRespository greetingRespository) {
            this.greetingRespository = greetingRespository;
        }

        public List<Greeting> getById(Long id) {
            return greetingRespository.findGreetingById(id);
        }

        public String hello() {
            return "Hello, World!";
        }
}
