package com.springboot.mvc_thymeleaf.thymeleafdemo.model;

public class Student {

    String firstName;
    String lasttName;

    public Student(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public Student(String firstName, String lasttName) {
        this.firstName = firstName;
        this.lasttName = lasttName;
    }
}
