package com.gmail.andrewrora.aklearning.proyect2.module;

import com.gmail.andrewrora.aklearning.proyect2.entity.SchoolSubject;
import com.gmail.andrewrora.aklearning.proyect2.student.Student;
import com.gmail.andrewrora.aklearning.proyect2.student.StudentManager;

import java.util.Scanner;
import java.util.UUID;

public class MainModule {

    private final StudentManager studentManager;

    public MainModule(){
        this.studentManager = new StudentManager();
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el nombre del estudiante");
        String name = scanner.nextLine();
        System.out.println("Dame el apellido del estudiante");
        String lastName = scanner.nextLine();
        System.out.println("Dame el grado del estudiante");
        int grade = scanner.nextInt();

        UUID id = this.studentManager.getStudent(name, lastName, grade).getId();

        Student student = this.studentManager.getStudent(id);

        student.addGrade(SchoolSubject.MATH, 10);
        student.addGrade(SchoolSubject.MATH, 5);
        student.addGrade(SchoolSubject.MATH, 10);
        student.addGrade(SchoolSubject.CHEM, 5);

        System.out.println(student.getName() + " " + student.getLastName());
        System.out.println(student.getId());
        System.out.println(SchoolSubject.MATH.getSubjectName() + " average is : " + student.getAverage(SchoolSubject.MATH));

    }

}
