package com.gmail.andrewrora.aklearning.proyect2.student;

import com.gmail.andrewrora.aklearning.proyect2.entity.SchoolSubject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentAverage {

    private final Map<SchoolSubject, List<Integer>> gradesBySubject;

    public StudentAverage(){
        gradesBySubject = new HashMap<>();
    }

    public void addGrade(SchoolSubject subject, int grade){
        if(!gradesBySubject.containsKey(subject)) {
            gradesBySubject.put(subject, new ArrayList<>());
        }

        gradesBySubject.get(subject).add(grade);
    }

    public double getAverage(SchoolSubject subject){
        if(!gradesBySubject.containsKey(subject)){
            return 0;
        }

        double average = 0;
        List<Integer> gradeList = gradesBySubject.get(subject);

        for(int grade : gradeList){
            average += grade;
        }

        average /= gradeList.size();

        return average;
    }

}
