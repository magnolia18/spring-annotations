package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

    //	@Autowired
    private Actor actor;

    public Movie() {
    }
    public Movie(Actor actor) {
        this.actor = actor;
        System.out.println("Constructor Autowired");
    }

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
        System.out.println("Inside setter method");

    }

    public void display()
    {
        System.out.println("Actor Name: "+actor.getName()+" Gender: "+actor.getGender()+" Age: "+actor.getAge() );
    }
}