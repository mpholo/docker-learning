package com.example.frontend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Mpholo Leboea
 * @Created : 2022/05/30
 **/
@RestController
public class HelloController {

    @GetMapping({"/hello","","/"})
    public String sayHello() {
        return "Hello World app for learning docker";
    }
}
