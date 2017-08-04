package com.example.leona.myapplication.model;

/**
 * Created by leona on 8/4/2017.
 */

public class userProfile {

    int height;
    String name;
    String gender;
    //assumed in pounds
    int weight;

    public userProfile(int height, String name, String gender, int weight, int height1) {
        this.height = height;
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.height = height1;
    }



    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
