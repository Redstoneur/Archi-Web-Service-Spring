package com.archiwebservice.esiee.respository;

import com.archiwebservice.esiee.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GreetingRespository extends JpaRepository<Greeting, Long> {


    Optional<Greeting> findGreetingById(Long id);
}
