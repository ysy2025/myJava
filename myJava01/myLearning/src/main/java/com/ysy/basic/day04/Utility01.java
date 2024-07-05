package com.ysy.basic.day04;

import java.util.Scanner;

/*
Utility 类用来实现读取控制面板的输入.
 */
public class Utility01 {
//    public static void main(String[] args) {
//        readNumber();
//    }

    // 初始化scanner,用来在控制面板进行输入.
    public static Scanner sc = new Scanner(System.in);

    //用于界面菜单的选择,读取键盘,只需要1,2,3,4这四种字符,其他的会提示错误.
    public static char readMenuSelection(){
        char c;
        for (;;){
            String str = readKeyBoard(1);
//            取输入的第一个字符
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4' ){
                System.out.println("sorry but you can only input 1,2,3 or 4;");
            }else{
                System.out.println("Congrates! you print" + c);
                break;
            }
        }
        return c;
    }

    // 读取键盘数字,只需要4位.
    private static int readNumber() {
        int i;
        for(;;){
            String str = readKeyBoard(4);
            try {
                i = Integer.parseInt(str);
                System.out.println("your input is: " + i);
                break;
            }catch(NumberFormatException e){
                System.out.println(e);
            }
        }
        return i;
    }

    // 用于读取字符串.
    public static String readString() {
        String str = readKeyBoard(8);
        System.out.println("your input is: " + str);
        return str;
    }

    // 用于读取selection.
    public static char readConfirmSelection(){
        char c;

        for(;;){
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N'){
                System.out.println("you select :" + c);
                break;
            }else{
                System.out.println("input wrong! please input again!");
            }
        }
        return c;
    }

    //用于读取键盘.是最基础的方法.
    public static String readKeyBoard(int limit) {
        String line = "";

        while(sc.hasNext()){
            line = sc.nextLine();
            if (line.length() < 1 || line.length() > limit){
                System.out.println("sorry but input string out of limit. please input again!");
                continue;
            }else{
                System.out.println("you just input: " + line);
                break;
            }
        }
        return line;
    }



}
