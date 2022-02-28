package com.ysy.day11;

/*
super关键字
父类和子类,子类重写方法,还想调用父类方法,就用super关键字
super理解为父类的xxx

super可以用来调用,属性,方法,构造器

子类设置了父类同名的属性,但是内容变了的时候,super和this调用的时候会不同.

我们可以在子类方法或者构造器中,super.属性或者super.方法,显式调用父类方法;一般忽略super.
特殊情况时,父类和子类定义了同名属性时,想在子类中调用父类中声明的属性,必须显式使用super.属性,表明调用的是父类中的属性.

方法
子类没有重写父类方法,且在子类中使用this.xxxx(这个方法,父类定义,子类没有重写),那么先找子类,找不到会调用父类
子类重写了父类中的方法,想在子类中调用父类中被重写方法,要显式使用super.xxx;

构造器
super调用构造器,需要显式使用super关键字(形参列表),调用父类的构造器
!!super(形参列表)的构造方式,必须在首行!!
类的构造器中,针对this(形参列表)或者super(形参列表),只能二选一;
构造器首行,没有显式声明this和super,默认调用super();


子类对象实例化的过程
从结果上看,子类继承父类以后获取了父类声明的属性和方法,
创建子类的对象在堆空间中就会加载所有父类声明的属性

从过程上来看
当我们通过通过子类构造器创建子类对象,一定会直接或者间接调用父类构造器,进而调用父类的父类的构造器,直到java.lang.Object类中空参数的构造器位置
正是因为加载了所有的父类的结构,才可以看到内存中有父类的结构,子类对象才可以考虑调用

创建子类对象时,调用了父类的构造器,但是自始至终就创建了一个对象
 */
public class super01 {
    public static void main(String[] args) {
//        ComicBook comicBook = new ComicBook("张三历险记", "张三");
//
//        comicBook.show();


        HisBook hisBook = new HisBook(100);

        hisBook.show();
        System.out.println(hisBook.amount);

        hisBook.show();
        hisBook.sale();
    }

}
