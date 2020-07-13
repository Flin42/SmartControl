package com.datasoldier.smartcontrol.test;

import java.util.ArrayList;


public class Sensor {
    private String sensorName;
    private int id;
    private String data;

    //id in the form of [ID][Data] eg 125

    public String getSensor(String s) {
        if(s.length()>6) {
            return "This is not the right message structure";
        }


        id = Character.getNumericValue(s.charAt(0));
        data = s.substring(1);

        System.out.println("ID: " + id);
        System.out.println("Data value: " + data);

        if(id == 1) {
            return evaluateTemp(Integer.parseInt(data));
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



}
