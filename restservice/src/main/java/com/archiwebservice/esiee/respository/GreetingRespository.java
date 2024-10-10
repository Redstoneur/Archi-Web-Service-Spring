package com.archiwebservice.esiee.respository;

import com.archiwebservice.esiee.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository interface for managing Greeting entities.
 * This interface extends JpaRepository to provide CRUD operations for Greeting entities.
 */
@Repository
public interface GreetingRespository extends JpaRepository<Greeting, Long> {

}
