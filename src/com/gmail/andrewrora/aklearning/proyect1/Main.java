package com.gmail.andrewrora.aklearning.proyect1; // Package

//Imports
import com.gmail.andrewrora.aklearning.proyect1.animal.Animal;
import com.gmail.andrewrora.aklearning.proyect1.animal.implementations.Cat;
import com.gmail.andrewrora.aklearning.proyect1.animal.implementations.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { // Class container
    // Header constants
    // Constructor
    // Procedures
    // Functions
    // Getters & Setters

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su perro");
        String dogName = scanner.nextLine();
        System.out.println("Ingrese la raza de su perro");
        String dogRace = scanner.nextLine();
        System.out.println("Ingrese la edad de su perro");
        int dogAge = scanner.nextInt();

        Dog dog2 = new Dog();
        Dog dog = new Dog(dogName, dogAge, dogRace);
        Cat cat = new Cat("Misu", dogAge + 1, "Siames");

        List<Animal> animalList = new ArrayList<>();

        animalList.add(dog2);
        animalList.add(dog);
        animalList.add(cat);

        for(Animal animal : animalList){
            System.out.println(animal.getName());
            animal.doSound();
        }
    }

}
