package com.mycode.springdemo.rest;

import com.mycode.springdemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoCon {
    private Coach coach;

    @Autowired
    public demoCon(Coach theCoach) {
        coach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

}
