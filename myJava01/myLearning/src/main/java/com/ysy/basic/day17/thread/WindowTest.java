package com.ysy.basic.day17.thread;

/**
 * 进程中会出现重票
 * 因此需要考虑进程安全问题!
 */
public class WindowTest {
    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();

        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window1.start();
        window2.start();
        window3.start();
    }
}

class Window extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        while(true){
            if(ticket >0){
                System.out.println(getName() + " 买票,号码为: " + ticket );
                ticket -= 1;
            }else{
                break;
            }
        }
    }
}