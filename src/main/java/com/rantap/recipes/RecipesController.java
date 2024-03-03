package com.rantap.recipes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipesController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

}
