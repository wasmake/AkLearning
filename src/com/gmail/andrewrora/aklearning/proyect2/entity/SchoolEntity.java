package com.gmail.andrewrora.aklearning.proyect2.entity;

import java.util.UUID;

public class SchoolEntity {
    private UUID id;
    private String name;
    private String lastName;

    private int grade;

    public SchoolEntity(String name, String lastName, int grade) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
