package com.exercise.test01;

import org.junit.Test;

public class IpParserTest {

    @Test
    public void test01(){
        IpParser ipParser = new IpParser();

        String ip = "192.168.1.101";

        System.out.println(ipParser.ipv6ToBytes(ip));
    }
}

