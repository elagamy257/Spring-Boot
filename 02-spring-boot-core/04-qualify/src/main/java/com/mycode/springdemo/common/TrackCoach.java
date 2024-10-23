package com.mycode.springdemo.common;


import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "TrackCoach";
    }
}
