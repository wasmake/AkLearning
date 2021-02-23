package com.gmail.andrewrora.aklearning.proyect2.student;

import com.gmail.andrewrora.aklearning.proyect2.entity.SchoolEntity;
import com.gmail.andrewrora.aklearning.proyect2.entity.SchoolSubject;

public class Student extends SchoolEntity {

    private final StudentAverage studentAverage;

    public Student(String name, String lastName, int grade) {
        super(name, lastName, grade);
        this.studentAverage = new StudentAverage();
    }

    public void addGrade(SchoolSubject subject, int grade){
        this.studentAverage.addGrade(subject, grade);
    }

    public double getAverage(SchoolSubject subject){
        return this.studentAverage.getAverage(subject);
    }

}
