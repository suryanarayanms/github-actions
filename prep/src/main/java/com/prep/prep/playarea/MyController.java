package com.prep.prep.playarea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MyController {
    @Autowired
    private MyService myService;

    @GetMapping("/run")
    public void run() {
        System.out.println(myService.process());
    }
}
