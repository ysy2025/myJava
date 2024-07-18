package org.ysy.chapter03.config;


import org.junit.Test;
import org.ysy.chapter03.entity.BussinessPerson;
import org.ysy.chapter03.entity.DogAnimal;
import org.ysy.chapter03.entity.UserEntity2;

public class AppConfigTest {


    @Test
    public void test01(){
        BussinessPerson bussinessPerson = new BussinessPerson();
        bussinessPerson.setAnimal(new DogAnimal());
        bussinessPerson.service();
    }

}