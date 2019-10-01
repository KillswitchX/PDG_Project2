package com.icesi.pdg_project.Entity;

import java.io.Serializable;

public class Client implements Serializable {

    private char genre;

    private int age;

    private int socialClass;

    private int planDuration;

    private int availableMinutes;

    private double planPrice;


    public Client(){

    }

    public Client(char genre, int age, int socialClass, int planDuration, int availableMinutes, double planPrice) {
        this.genre = genre;
        this.age = age;
        this.socialClass = socialClass;
        this.planDuration = planDuration;
        this.availableMinutes = availableMinutes;
        this.planPrice = planPrice;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSocialClass() {
        return socialClass;
    }

    public void setSocialClass(int socialClass) {
        this.socialClass = socialClass;
    }

    public int getPlanDuration() {
        return planDuration;
    }

    public void setPlanDuration(int planDuration) {
        this.planDuration = planDuration;
    }

    public int getAvailableMinutes() {
        return availableMinutes;
    }

    public void setAvailableMinutes(int availableMinutes) {
        this.availableMinutes = availableMinutes;
    }

    public double getPlanPrice() {
        return planPrice;
    }

    public void setPlanPrice(double planPrice) {
        this.planPrice = planPrice;
    }
}
