package com.mycode.springdemo.rest;

import com.mycode.springdemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoCon {
    private Coach coach;
    private Coach anotherCoach;

    @Autowired
    public void DemoCon(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In constructor: "+getClass().getSimpleName());
        coach = theCoach;
        anotherCoach = theAnotherCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String getCheck() {
        return "Comparing beans: mycoach == anotherCoach" +(coach == anotherCoach);
    }
}
