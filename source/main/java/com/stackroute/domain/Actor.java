package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {

    @Value("Vijay")
    private String name;

    @Value("male")
    private String gender;

    @Value("35")
    private int age;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}