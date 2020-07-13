package com.datasoldier.smartcontrol.test;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/test")
//@Controller("/test")
@RequestMapping("/sensor/getvalue")
@Controller("/sensor/getvalue")
public class DataController {

    String data;
    Sensor sensor = new Sensor();



    @GetMapping()
    public String Data(@RequestBody String s) {
        System.out.println("received message is: " + s);
        return sensor.getSensor(s);

    }



}
