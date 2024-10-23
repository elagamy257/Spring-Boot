package com.mycode.springdemo.rest;

import com.mycode.springdemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoCon {
    private Coach coach;


    @Autowired
    public void DemoCon(
            @Qualifier("aquatic") Coach theCoach) {
        System.out.println("In constructor: "+getClass().getSimpleName());
        coach = theCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

   }
