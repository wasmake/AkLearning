package com.gmail.andrewrora.aklearning.proyect2.student;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class StudentManager {

    private final Map<UUID, Student> students;

    public StudentManager() {
        this.students = new HashMap<>();
    }

    public Student getStudent(UUID studentId){
        return this.students.get(studentId);
    }

    public Student getStudent(String name, String lastName, int grade){
        Student student = new Student(name, lastName, grade);

        this.students.put(student.getId(), student);

        return student;
    }

}
