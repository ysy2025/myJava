package org.ysy.chapter03.entity;

import org.springframework.stereotype.Component;

@Component(value = "dogAnimal")
public class DogAnimal implements Animal {
    @Override
    public void use() {
        System.out.println("dog likes eatting food");
    }
}
