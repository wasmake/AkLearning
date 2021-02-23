package com.gmail.andrewrora.aklearning.proyect1.animal.implementations;

import com.gmail.andrewrora.aklearning.proyect1.animal.Animal;

public class Dog extends Animal {

    public Dog(){
        super("Doggo", "Shiba", 5);
    }

    public Dog(String name, int age, String race){
        super(name, race, age);
    }

    @Override
    public void doSound(){
        System.out.println("Woof woof!");
    }

}
