package com.example.modelclass;

public class CourseModelClass {
    String courseName;
    int courseFees;
    int duration;

    void setCourseName(String courseName){
        this. courseName=courseName;
    }

    void setCourseFees(int courseFees){
        this. courseFees=courseFees;
    }
    void setDuration(int duration){
        this. duration=duration;
    }
    String getCourseName(){
        return courseName;
    }
    int getCourseFees(){
        return courseFees;
    }
    int getDuration(){
        return duration;
    }
}
