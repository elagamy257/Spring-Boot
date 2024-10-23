<<<<<<<< HEAD:01-speing-boot-overview/03-dev-security-demo/MyApp/src/main/java/com/elagamy/MyApp/rest/funRestCon.java
package com.elagamy.MyApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestCon {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k! ";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day. ";
    }
}
========
package com.elagamy.MyApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestCon {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k! ";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day. ";
    }
}
>>>>>>>> de431a157ba2d02d44c22df9757046c6f0ff9c68:02-dev-demo/MyApp/src/main/java/com/elagamy/MyApp/rest/funRestCon.java
