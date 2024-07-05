package com.ysy.basic.day07;

public class klass06 {
    public static void main(String[] args) {
        klass06 k1 = new klass06();
        k1.method();
    }

    public void method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
