package jchapter03;

public class Test01 {
    public static void main(String[] args) {
        String s1  = "hello";
        String s2  = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        Long a = 100L;
        a += 1;
        System.out.println(a);

        System.out.println(++a);
        System.out.println(a);
    }
}
