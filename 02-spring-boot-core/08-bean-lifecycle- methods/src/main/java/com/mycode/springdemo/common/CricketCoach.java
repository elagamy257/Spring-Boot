package com.mycode.springdemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: "+getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartup() {
        System.out.println("In doMyStartup: "+getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyShutdown() {
        System.out.println("In doMyShutdown: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Every thing will be fine :)";
    }
}
