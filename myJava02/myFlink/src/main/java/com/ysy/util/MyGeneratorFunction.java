package com.ysy.util;

import org.apache.flink.connector.datagen.source.GeneratorFunction;

public class MyGeneratorFunction<Long, String> implements GeneratorFunction<Long, String> {

    @Override
    public String map(Long aLong) throws Exception {
        return (String) ("" + aLong);
    }
}