package com.datasoldier.smartcontrol.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController{

    @GetMapping("/greeting")
    public String greeting() {
        return "greeting";
    }

    @PostMapping("/greeting")
    public String result(@RequestParam("txt") String s){
        if(s.equalsIgnoreCase("up")) {
            System.out.println("up");
        } else if(s.equalsIgnoreCase("right")) {
            System.out.println("right");
        } else if(s.equalsIgnoreCase("down")) {
            System.out.println("down");
        } else if(s.equalsIgnoreCase("left")) {
            System.out.println("left");
        } else {
            System.out.println("not a direction");
        }
        System.out.println(s);
        return "result";

    }


}
