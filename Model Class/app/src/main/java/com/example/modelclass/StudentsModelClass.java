package com.example.modelclass;

public class StudentsModelClass {
    String name;
    int id;
    Double maths, english, science;
    String school;

    void setName(String name) {
        this.name = name;

    }

    void setId(int id) {

        this.id = id;

    }

    void setMaths(Double maths) {

        this.maths = maths;

    }

    void setEnglish(Double english) {

        this.english = english;

    }

    void setScience(Double science) {

        this.science = science;

    }

    void setSchool(String school) {

        this.school = school;
    }

    String getName() {
        return name;

    }

    int getId() {
        return id;

    }

    Double getMaths() {
        return maths;

    }

    Double getEnglish() {
        return english;

    }

    Double getScience() {
        return science;

    }

    String getSchool() {
        return school;

    }


}
