package com.ysy3.aop.annotation;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 *
 */
@Component
@Aspect
@Order(1)
public class ValidateAspect {


//    @Pointcut("execution(* com.ysy3.aop.annotation.CalculatorImpl.*(..))")
//    public void pointCut(){}


    @Before("com.ysy3.aop.annotation.LoggerAspect.pointCut()")
    public void beforeMethod(){
        System.out.println("ValidateAspect -- > 张三");
    }
}
