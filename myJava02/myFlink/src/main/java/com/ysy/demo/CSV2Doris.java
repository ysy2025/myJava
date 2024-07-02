package com.ysy.demo;

import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.io.CsvReader;
import org.apache.flink.api.java.operators.DataSource;

public class CSV2Doris {
    public static void main(String[] args) throws Exception {
        // env
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();


        String path = "D:\\ALinux\\data\\archive7\\retail_data.csv";


    }
}
