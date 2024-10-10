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
<<<<<<< HEAD
}
=======

    /**
     * Finds a list of Greeting entities by their ID.
     *
     * @param id The ID of the Greeting entities to find.
     * @return A list of Greeting entities with the specified ID.
     */
    List<Greeting> findGreetingById(Long id);

}
>>>>>>> ffe264e8e14532a425afcd87d52b6b2e525144bc
