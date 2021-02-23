package com.gmail.andrewrora.aklearning.proyect2.entity;

public enum SchoolSubject {
    MATH("Mathematics"), CHEM("Chemistry"), PHYS("Physics"), SPAN("Spanish");

    private String subjectName;

    SchoolSubject(String subjectName){
        this.subjectName = subjectName;
    }

    public String getSubjectName(){
        return this.subjectName;
    }

}
