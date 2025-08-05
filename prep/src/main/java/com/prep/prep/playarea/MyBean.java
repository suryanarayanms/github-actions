package com.prep.prep.playarea;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public MyBean() {
        System.out.println("Constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct: init()");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy: destroy()");
    }
}
