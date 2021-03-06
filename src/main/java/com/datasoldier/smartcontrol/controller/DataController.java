package com.datasoldier.smartcontrol.controller;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@RequestMapping("/GetData")
@Controller("/GetData")
public class DataController {


    @GetMapping()
    @Scheduled(fixedRate = 1000)
    public static ModelAndView response() throws IOException {
        //Get JSon String from url
        String url = "http://192.168.1.42:8080/sensor/getvalue";
        RestTemplate restTemplate = new RestTemplate();
        String jsonMessage = restTemplate.getForObject(url, String.class);

        //Create proper sensor given the Json message
        Sensor sensor = new Sensor(jsonMessage);
        //Return data needed from sensor
        System.out.println(sensor.getData());


        ModelAndView mav = new ModelAndView("GetData");
        mav.addObject("sensorName", "Sensor: " + sensor.getName());
        mav.addObject("data" , "Reading: " + sensor.getData());
        mav.addObject("ID", "ID: "+ sensor.getID());
        mav.addObject("type", "Type: "+ sensor.getType());
        return mav;



    }



}
