package com.datasoldier.smartcontrol.controller;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;


public class Sensor {
    private String name;
    private int id;
    private String data;
    private String type;

    Sensor(String s) throws IOException {
        //Converts Json string into correct object in order to access specific fields
        ObjectMapper mapper = new ObjectMapper();
        JsonFactory factory = mapper.getFactory();
        JsonParser parser = factory.createParser(s);
        JsonNode actualObj = mapper.readTree(parser);
        //Assign each field to correct variable
        data = String.valueOf(actualObj.get("valuestring"));
        name = String.valueOf(actualObj.get("name"));
        id = Integer.parseInt(String.valueOf(actualObj.get("sensor_id")));
        type = String.valueOf(actualObj.get("valuetype"));

    }

    public String getSensor() {
        System.out.println("ID: " + id);
        System.out.println("Data value: " + data);

        if(id == 1) {
            System.out.print(data);
            return data;
        } else {
            System.out.println("Could not identify sensor");
            return "No sensor identified or incorrect message structure";
        }

    }

    //Temperature Sensor
    public String evaluateTemp(int temperature) {
        if(temperature > 25) {
            return "The temperature is greater than room temp";
        }
        else if(temperature < 25) {
            return "The temperature is less than room temp";
        }
        else {
            return "The temperature is room temp";
        }
    }

    //Humidity sensor


    public String getData() {
        return data;
    }


}
