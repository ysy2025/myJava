package com.ysy.basic.day15;

/*
* 接口的非匿名类的非匿名对象
* 接口的非匿名类的匿名对象
*
* 接口的匿名类的非匿名对象
* 接口的匿名类的匿名对象
*
* 上述4种类型的实现要注意
*
* 代理模式
* 代理设计,就是为其他对象提供一种代理,以控制对这个对象的访问
*
* 安全代理:屏蔽对真实角色的直接访问
* 远程代理:通过代理类,远程处理远程方法调用
* 延迟加载:先加载轻量级的代理对象,需要的时候再加载真实对象
*
* 分类:静态代理,动态代理
 */
public class interface02 {
    public static void main(String[] args) {
        Server server = new Server();

        Proxy proxy = new Proxy(server);

        proxy.browse();


    }
}

interface Network{
    public abstract void browse();

}

// 被代理的类
class Server implements Network{
    @Override
    public void browse() {
        System.out.println("!!!");
    }
}

// 代理类
class Proxy implements Network{
    private Network net;

    public Proxy(Network net) {
        this.net = net;
    }

    public void check(){
        System.out.println("----");
    }
    @Override
    public void browse() {
        check();
        net.browse();
    }
}