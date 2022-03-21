package com.design.patterns.prototype.deepclone;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable{

    public String name;

    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
        super();
    }

    //深拷贝,clone,相当于重写
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;

        try {
            // 完成基本数据类型的克隆
            deep = super.clone();

            // 单独处理引用数据类型
            /*
            这里的,deep,首先只是一个Object,克隆基本数据类型之后,还是object
            然后想复制引用数据类型,需要先转换成DeepProtoType,也就是这里的强制转换
            然后,对引用数据类型进行处理
            前面的 deepCloneableTarget 是 DeepCloneableTarget, 本身就可以 clone
            因此,直接clone,就可以了
             */
            DeepProtoType deepProtoType = (DeepProtoType) deep;
            deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

            return deepProtoType;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    // 方式2, 通过对象序列化,实现深拷贝->推荐使用
    public Object DeepClone() {
        // 声明流对象
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            // 正式创建对象
            bos = new ByteArrayOutputStream();

            // 字节输出流 -> 对象输出流
            oos = new ObjectOutputStream(bos);

            // 把当前这个对象,以对象流写入,然后再以相同的方式输出->序列化;输出的时候,会把引用类型也输出出去
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());

            ois = new ObjectInputStream(bis);

            DeepProtoType copy = (DeepProtoType) ois.readObject();

            return copy;
        }catch(Exception e){
            e.printStackTrace();

            return null;
        }finally{
            // 关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
