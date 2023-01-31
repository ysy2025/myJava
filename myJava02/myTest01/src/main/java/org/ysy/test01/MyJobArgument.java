package org.ysy.test01;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MyJobArgument {

    public String toJsonString() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.findAndRegisterModules();
            return objectMapper.writeValueAsString("{\"a\":\"b\"}");
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("convert to json string failed!", e.fillInStackTrace());
        }
    }

    public static MyJobArgument fromJsonString(String str) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.findAndRegisterModules();
            return objectMapper.readValue(str, MyJobArgument.class);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("convert from json string failed : " + str + "   " + e.getMessage(),
                    e.fillInStackTrace());
        }
    }
}
