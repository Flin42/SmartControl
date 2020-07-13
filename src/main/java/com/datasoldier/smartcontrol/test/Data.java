package com.datasoldier.smartcontrol.test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    private String word;

    public Data(@JsonProperty("data") String s) {
        word = s;
    }

    public String getData() {
        return word;
    }

}
