package com.fastjson2demo;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;

/**
 * @author yangsiyu
 * @since 2024/7/25.
 */
public class Demo01 {
    public static void main(String[] args) {
//        JSONObject info = new JSONObject();
//        info.put("name", "张三");
//        info.put("age", "18");
//        info.put("地理", "70");
//        info.put("英语", "60");
//
//        System.out.println(info);

        JSONObject info1 = new JSONObject();
        info1.put("name", "张三");
        info1.put("age", "18");
        JSONObject info2 = new JSONObject();
        info2.put("name", "李四");
        info2.put("age", "19");

        //把上面创建的两个json对象加入到json数组里
        JSONArray array = new JSONArray();
        array.add(info1);
        array.add(info2);

        System.out.println(array);

        Object o = array.get(1);
        System.out.println(o);




    }
}
