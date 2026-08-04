package com.example.demo;

public class Registration {
    private int id;
    private String name;
    private String email;
    private String eventName;

    public Registration() {
    }

    public Registration(int id, String name, String email, String eventName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.eventName = eventName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
