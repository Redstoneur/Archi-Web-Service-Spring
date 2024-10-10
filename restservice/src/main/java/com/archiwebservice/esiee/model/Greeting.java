package com.archiwebservice.esiee.model;

import jakarta.persistence.*;

/**
 * Entity class representing a Greeting.
 */
@Entity
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "content")
    private String content;

    /**
     * Default constructor for the Greeting entity.
     */
    public Greeting() {

    }

    /**
     * Gets the ID of the Greeting.
     *
     * @return The ID of the Greeting.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the Greeting.
     *
     * @param id The ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Constructs a new Greeting with the specified ID and content.
     *
     * @param id The ID of the Greeting.
     * @param content The content of the Greeting.
     */
    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    /**
     * Gets the content of the Greeting.
     *
     * @return The content of the Greeting.
     */
    public String getContent() {
        return content;
    }
}