package com.CICDWorkFlow.Greet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class greet {

    @GetMapping("/greet")
    public String greet(){
        return "Hello, How Are You?";
    }

    @GetMapping("/morning")
    public String morning(){
        return "Good Morning";
    }
}
