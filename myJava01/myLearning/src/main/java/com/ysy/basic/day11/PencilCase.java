package com.ysy.basic.day11;

public class PencilCase extends Pencil {

    int id;

    public PencilCase() {
        super();
    }
    public PencilCase(int height, int weight) {
        this.height = height;
        //this.weight = weight; //这里的weight是私有的,不能这么直接调用;
        setWeight(weight);
    }
    public PencilCase(String name, int height, int weight) {
        super(name, height, weight);
    }

    public PencilCase(String name, int height, int weight, int id){
        super(name, height, weight);

        this.id = id;

    }
    @Override
    public void draw() {
        super.draw();
        // 这个talk不是调用父类的,而是自己的.
        talk();
    }

    @Override
    public void walk() {
        System.out.println("I hate walking and I like driving!");
    }

    public void show(){
        System.out.println("name is " + name + " height is " + height + " weight is " + getWeight());
    }

    public void talk(){
        System.out.println("niubi!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("niubi!!!");
    }
}
