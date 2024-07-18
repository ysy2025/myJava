package org.ysy.chapter03.entity;

public class CatAnimal implements Animal {
    @Override
    public void use() {
        System.out.println("cat likes eatting fish");
    }
}
