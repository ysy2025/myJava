package com.ysy.basic.day15;

/*
* 内部类
* 定义在一个类中的类->内部类
* 当一个事物的内部,还要一个部分需要一个完整的结构进行描述,而这个内部的完整的结构又只为了外部事物提供服务,那么整个内部的完整结构最好使用内部类
* inner class 一般用在定义它的类或者语句块之内,在外部使用的时候必须给出完整的名称
* inner clas的名字不能与包含它的外部类名称相同
*
* 成员内部类(static成员内部类和非static成员内部类)
* 局部内部类(不谈修饰符 方法内,构造器内,代码块内),匿名内部类
*
*
* 成员内部类
*   一方面,是外部类的成员
*       可以调用外部类的结构
*       作为成员,可以用static修饰
*       可以被四种权限修饰符修饰
*
*   一方面,是类
*       声明 属性,方法,构造器 等
*       可以被final修饰,不能继承;不用final的时候可以被继承
*       可以被abstract修饰,表示不能被实例化了
*
* 关注3个问题
*   如何实例化内部类的对象
*   如何在成员内部类中区分调用外部类的结构
*       上面liangge,巧妙使用 父类.this.xxx
*
*   开发当中,局部内部类如何使用
*       返回一个实现了xxx接口的类的对象
*
 */
public class Inner {
    public static void main(String[] args) {
        Text text = new Text();
        text.openText();

        //创建 静态 excel 实例
        Text.Excel excel = new Text.Excel();
        excel.openExcel();
        // 实例化 非静态 word的实例
        Text.Word word = text.new Word();
        word.openWord();
    }
}

class Text {
    String textName;
    int size;

    public void openText(){
        System.out.println("open text ");
    }

    // 静态成员内部类
    static class Excel{
        String excelName;
        int size;

        public void openExcel(){
            System.out.println("open excel!" + excelName);
        }

        // 不能调用非静态的方法
//        openText();

    }

    // 非静态成员内部类
    class Word{
        String wordName;
        int size;

        public void openWord(){
            System.out.println("open word!" + wordName);
            // 调用外部类的方法
            Text.this.openText();
        }


        public void show(){
            System.out.println(this.size);//内部类的属性
            System.out.println(Text.this.size);//外部类的属性
        }
    }

    // 方法中的内部类
    public void method(){

        class A{

        }
    }

    //代码块中的内部类
    {
        class B{

        }
    }

    public Text() {
        class D{

        }

    }
}