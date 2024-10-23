package com.mycode.springdemo.config;

import com.mycode.springdemo.common.Coach;
import com.mycode.springdemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }

}
