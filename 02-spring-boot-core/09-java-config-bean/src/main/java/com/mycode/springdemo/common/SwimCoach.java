package com.mycode.springdemo.common;


public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "SwimCoach";
    }
}
