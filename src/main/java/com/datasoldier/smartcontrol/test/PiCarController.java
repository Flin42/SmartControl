package com.datasoldier.smartcontrol.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class PiCarController {

    @GetMapping("/PiCar")
    public String greeting() {
        return "PiCar";
    }

    /*@PostMapping("/PiCar")
    public Model result(@RequestParam("txt") String s, Model model){
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
        return model;
        */

    @RequestMapping(params = "up", value = "PiCar")
    public ModelAndView up(HttpServletRequest request) {
        System.out.println("up");
        return new ModelAndView("PiCar");
    }

    @RequestMapping(params = "right", value = "PiCar")
    public ModelAndView right(HttpServletRequest request) {
        System.out.println("right");
        return new ModelAndView("PiCar");
    }

    @RequestMapping(params = "left", value = "PiCar")
    public ModelAndView left(HttpServletRequest request) {
        System.out.println("left");
        return new ModelAndView("PiCar");
    }

    @RequestMapping(params = "down", value = "PiCar")
    public ModelAndView down(HttpServletRequest request) {
        System.out.println("down");
        return new ModelAndView("PiCar");
    }


}

