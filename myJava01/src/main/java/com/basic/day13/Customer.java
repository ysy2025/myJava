package com.basic.day13;

public class Customer {
    int id = 1;
    String name = "zhangsan";

    /**
     * 判断实体内容是否相同
     * 重写的规则,就是判断属性是不是相同
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        System.out.println("Customer 重写的 equals");
        if (this == obj){
            return true;
        }
        if (obj instanceof Customer){
            Customer cust = (Customer) obj;

            // 比较两个对象的每个属性是否都相同
            return (this.id == cust.id && this.name.equals(cust.name));
        }
        return false;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
