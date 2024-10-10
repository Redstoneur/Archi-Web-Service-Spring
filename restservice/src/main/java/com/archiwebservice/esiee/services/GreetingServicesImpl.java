package com.archiwebservice.esiee.services;

import com.archiwebservice.esiee.model.Greeting;
import com.archiwebservice.esiee.respository.GreetingRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingServicesImpl implements GreetingServices {

    @Autowired
    private GreetingRespository greetingRespository;
    @Override
    public List<Greeting> getAllGreeting() {
        return greetingRespository.findAll();
    }

    @Override
    public Optional<Greeting>
    getGreetingById(Long id) {
        return greetingRespository.findById(id);
    }

    @Override
    public Greeting createGreeting(Greeting greeting) {
        return greetingRespository.save(greeting);
    }

    @Override
    public Optional<Greeting> updateGreeting(Long id, Greeting greetingDetail) {
        return  greetingRespository.findById(id).map(gretting -> {
            gretting.setContent(greetingDetail.getContent());
            return greetingRespository.save(gretting);
        });
    }

    @Override
    public boolean deleteGreeting(Long id) {
        if (greetingRespository.existsById(id)) {
            greetingRespository.deleteById(id);
            return true;
        }
        return false;
    }
    }

