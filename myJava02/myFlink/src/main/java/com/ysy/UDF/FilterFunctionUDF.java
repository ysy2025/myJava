package com.ysy.UDF;

import com.ysy.bean.WaterSensor;
import org.apache.flink.api.common.functions.FilterFunction;

public class FilterFunctionUDF implements FilterFunction<WaterSensor> {
    @Override
    public boolean filter(WaterSensor value) throws Exception {
        if(value.ts%2 == 1){
            return true;
        }else {
            return false;
        }
    }
}
