
package com.klu.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @GetMapping("/ms1/add")
    public String add(
            @RequestParam int a,
            @RequestParam int b) {

        int sum = a + b;

        return "ms1.1 addition=" + sum;
    }
}
