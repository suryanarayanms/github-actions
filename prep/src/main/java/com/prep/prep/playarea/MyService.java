package com.prep.prep.playarea;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyService {
    @Bean
    public String process() {
        System.out.println("Processing...");
        return "Processing...";
    }
}
