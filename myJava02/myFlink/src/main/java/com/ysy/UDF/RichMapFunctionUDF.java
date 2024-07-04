package com.ysy.UDF;

import org.apache.flink.api.common.functions.RichMapFunction;
import org.apache.flink.configuration.Configuration;

public class RichMapFunctionUDF extends RichMapFunction<String, String> {

    @Override
    public void open(Configuration parameters) throws Exception {
        System.out.println("It is customerized rich map function!");
    }

    @Override
    public String map(String s) throws Exception {
        return s.toLowerCase();
    }

    @Override
    public void close() throws Exception {
        System.out.println("rich map function closed!");
    }
}
