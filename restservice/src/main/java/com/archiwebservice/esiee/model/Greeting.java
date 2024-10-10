package com.archiwebservice.esiee.model;

import jakarta.persistence.*;

@Entity
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "content", nullable = false)
    private String content;

    public Greeting() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }


    public String getContent() {
        return content;
    }
}
