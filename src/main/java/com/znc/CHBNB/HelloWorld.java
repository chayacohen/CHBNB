package com.znc.CHBNB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/")
    public String myHelloWorld() {
        return "I'm online";
    }
}
