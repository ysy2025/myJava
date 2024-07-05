package com.ysy.design.patterns.composite.client;

import com.ysy.design.patterns.composite.organization.College;
import com.ysy.design.patterns.composite.organization.Department;
import com.ysy.design.patterns.composite.organization.University;

public class Client {
    public static void main(String[] args) {

        // 从大到小,创建对象
        University university = new University("清华大学", "Top2");

        // 学院
        College college = new College("计算机", "牛逼");
        College college2 = new College("电子工程", "牛逼plus");

        // 系
        college.add(new Department("软件工程", "高薪岗位"));
        college.add(new Department("网络工程", "高薪岗位2"));
        college.add(new Department("计算机科学与技术", "老牌专业+高薪"));

        college2.add(new Department("电子科学", "很难"));
        college2.add(new Department("通信电子", "华为中兴"));

        university.add(college);
        university.add(college2);

//        university.show();

        college.show();
    }
}
