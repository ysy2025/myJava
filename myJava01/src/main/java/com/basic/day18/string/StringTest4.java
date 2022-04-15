package com.basic.day18.string;

public class StringTest4 {
    String str = new String("good");
    char[] ch = {'t', 'e','s','t'};

    public void change(String str, char ch[]){
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest4 st = new StringTest4();
        st.change(st.str, st.ch);
        /*
        string 不可变
        这里的参数,String str,是一个新对象,指向st.str,但是改变后,参数指向新的对象,st.str不变

        数组,是在堆空间的,一荣俱荣;
        String是在常量池中的!
        * */
        System.out.println(st.str);
        System.out.println(st.ch);

        "zhangsan".compareTo("as");
    }
}
