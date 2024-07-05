package com.ysy.javaagent;

import javassist.*;

import java.io.ByteArrayInputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class MyTransformer implements ClassFileTransformer {
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        System.out.println("Loading class :" + className);

        if(!"Test".equals(className)){
            return classfileBuffer;
        }
        CtClass cl = null;

        try{
            /**
             * 此代码的含义是获取被加强类,使用反射的方式获取方法名称为test()的函数,
             * 然后使用ctMethod.insertBefore方法在调用前执行内容,ctMethod.insertAfter方法在调用后执行内容
             */
            ClassPool classPool = ClassPool.getDefault();
            cl = classPool.makeClass(new ByteArrayInputStream(classfileBuffer));
            CtMethod ctMethod = cl.getDeclaredMethod("test");

            System.out.println("Get Method Name :" + ctMethod.getName());

            ctMethod.insertBefore("System.out.println(\"before the method \");");
            ctMethod.insertAfter("System.out.println(\"after the method \");");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classfileBuffer;
    }
}
