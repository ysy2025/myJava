package com.ysy3.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 切面中需要通过指定注解将方法标识为通知方法
 * @Before:前置通知,目标对象方法执行之前执行
 *
 */
@Component
public class LoggerAspect {


    public void afterAdviceMethod2(JoinPoint joinpoint){
        String methodName = joinpoint.getSignature().getName();
        String args = Arrays.toString(joinpoint.getArgs());
        System.out.println("asdfasdfasdfsdf");
        System.out.println("Logger-->前置通知,方法名:"+methodName+"，参数:"+args);
    }


    public void afterAdviceMethod(JoinPoint joinpoint){
//        String methodName = joinpoint.getSignature().getName();
//        String args = Arrays.toString(joinpoint.getArgs());
//        System.out.println("Logger-->前置通知,方法名:"+methodName+"，参数:"+args);

        System.out.println("Logger-->后置通知,方法名:");
    }



    @AfterReturning(value = "pointCut()", returning = "result")
    public void afterReturnMethod(JoinPoint joinpoint, Object result){
        String methodName = joinpoint.getSignature().getName();
        String args = Arrays.toString(joinpoint.getArgs());
        System.out.println("Logger-->返回值,通知,方法名:"+methodName+"，参数:"+args);

        System.out.println("返回值是:" + result);
    }


    public void afterExceptMethod(JoinPoint joinpoint, Exception ex){
        String methodName = joinpoint.getSignature().getName();
        String args = Arrays.toString(joinpoint.getArgs());
        System.out.println("!!!!!!!!!!!!!");
        System.out.println("Logger-->异常,通知,方法名:"+methodName+"，参数:"+args + "Exception are: " + ex);

    }



    // 环绕通知方法一定要和目标对象方法的返回值保持一致
    public Object aroundAdviceMethod(ProceedingJoinPoint joinpoint){
        Object result = null;
        // 方法的执行
        try {
            System.out.println("lalala lalala woshi maibao de xiaodangjia");
            result = joinpoint.proceed();

            System.out.println("huanrao tongzhi fanhuizhi");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("huanrao tongzhi yichang tongzhi");
        }finally{
            System.out.println("");
            System.out.println("houzhi tongzhi");
        }

        return result;
    }
}
