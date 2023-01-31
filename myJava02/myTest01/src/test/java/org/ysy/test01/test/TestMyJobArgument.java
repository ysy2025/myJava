package org.ysy.test01.test;

import org.junit.Test;
import org.ysy.test01.MyJobArgument;

public class TestMyJobArgument {

    @Test
    public void test01(){
        MyJobArgument myJobArgument = new MyJobArgument();

        String res = myJobArgument.toJsonString();

        System.out.println(res);

        MyJobArgument myJobArgument1 = MyJobArgument.fromJsonString(res);

        System.out.println(myJobArgument1);
    }
}
