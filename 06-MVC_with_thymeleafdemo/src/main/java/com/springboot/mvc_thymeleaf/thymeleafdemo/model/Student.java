package com.springboot.mvc_thymeleaf.thymeleafdemo.model;


import java.util.List;

public class Student {

    String firstName;
    String lastName;
    String Country;
    List<String> favoriteSystems;
    String favoriteLanguage;

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

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public List<String> getFavoriteSystems() {
        return favoriteSystems;
    }

    public void setFavoriteSystems(List<String> favoriteSystems) {
        this.favoriteSystems = favoriteSystems;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
}

