package com.ysy.basic.day17.thread;

class test {
static class inner{
    public static void sleep(long millis){
        System.out.println("zhangsan");
    };
}

    public static void main(String[] args) {
//        inner inner = new inner();
        inner.sleep(10);
    }
}
