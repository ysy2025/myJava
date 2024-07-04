package com.ysy.util;

public class Json2List {
    public String[] handle(String s, String raw, String replace, String spliter){
        String temp = s.substring(1,s.length()-1);

        String temp2 = temp.replace(raw, replace);

        String[] split = temp2.split(spliter);

        return split;
    }

}
