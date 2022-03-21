package com.design.patterns.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws Exception {
        DeepProtoType deepProtoType = new DeepProtoType();

        deepProtoType.name = "songjiang";

        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("zhangsan", "jiqiren");

        // 方式1,深拷贝
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.clone();

        System.out.println(deepProtoType.name + deepProtoType.deepCloneableTarget.hashCode());

        System.out.println(deepProtoType2.name + deepProtoType2.deepCloneableTarget.hashCode());

        // 方式2
        DeepProtoType deepProtoType3 = (DeepProtoType) deepProtoType.DeepClone();
        System.out.println(deepProtoType3.name + deepProtoType3.deepCloneableTarget.hashCode());
    }
}
