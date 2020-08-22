package com.datasoldier.smartcontrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Tony Cheng <cyy8913@gmail.com>
 * Date: 2020-06-18
 */
@RestController
@RequestMapping("/hello")
@Controller("/hello")
public class HelloController {

    @GetMapping("")
    public String hello() {
        return "Hello there";
    }
}
