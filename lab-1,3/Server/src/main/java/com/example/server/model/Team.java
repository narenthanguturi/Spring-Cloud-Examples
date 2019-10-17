package com.example.server.model;

import javax.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String location;

    public Team() {
    }

    public Team(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
