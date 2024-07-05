package com.hadoop.day01;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    @Test
    public void test01() {
        //
        final Pattern regex = Pattern.compile("^\\[(\\w*)\\](.+)$");

        String rawLocation = "[hdfs]a";

        Matcher matcher = regex.matcher(rawLocation);

        System.out.println(matcher);

        boolean m = matcher.matches();
        System.out.println(m);
        if (matcher.matches()) {
            String classString = matcher.group(1);
            String result = matcher.group(2).trim();
            System.out.println(classString);
            System.out.println(result);
        }
    }
}
