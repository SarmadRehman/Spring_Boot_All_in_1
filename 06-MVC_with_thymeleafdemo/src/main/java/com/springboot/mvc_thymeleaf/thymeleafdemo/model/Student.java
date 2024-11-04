package com.springboot.mvc_thymeleaf.thymeleafdemo.model;

public class Student {

    String firstName;
    String lastName;

    public Student(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lasttName) {
        this.lastName = lasttName;
    }

    public Student(String firstName, String lasttName) {
        this.firstName = firstName;
        this.lastName = lasttName;
    }
}
