package com.gmail.andrewrora.aklearning.proyect1.animal.implementations;

import com.gmail.andrewrora.aklearning.proyect1.animal.Animal;

public class Cat extends Animal {

    public Cat(String name, int age, String race){
        super(name, race, age);
    }

    @Override
    public void doSound(){
        System.out.println("Miau miau!");
    }

}
