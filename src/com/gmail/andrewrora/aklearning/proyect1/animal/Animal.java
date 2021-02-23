package com.gmail.andrewrora.aklearning.proyect1.animal;

public class Animal {
    private boolean alive;
    private String name;
    private String race;
    private int age;

    private boolean hunger;
    private boolean thirsty;

    public Animal(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;

        this.alive = true;
    }

    public void doSound(){
        System.out.println("No tengo sonido!");
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHunger() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public boolean isThirsty() {
        return thirsty;
    }

    public void setThirsty(boolean thirsty) {
        this.thirsty = thirsty;
    }
}
