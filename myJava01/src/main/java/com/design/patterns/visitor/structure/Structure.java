package com.design.patterns.visitor.structure;

import com.design.patterns.visitor.actor.Action;
import com.design.patterns.visitor.person.Person;

import java.util.LinkedList;
import java.util.List;

/**
 * 管理和维护了一个集合
 */
public class Structure {

    // 维护了一个人的结合
    private List<Person> persons = new LinkedList<Person>();

    // 增加人到list
    public void attach(Person p){
        persons.add(p);
    }

    // 移除
    public void remove(Person p){
        persons.remove(p);
    }

    // 显示评测结果
    public void display(Action action){
        for (Person p:persons){
            p.accept(action);
        }
    }
}
