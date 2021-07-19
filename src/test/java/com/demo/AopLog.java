package com.demo;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 * <p>
 * 使用 aop 切面记录请求日志信息
 * </p>
 *
 * @author yangkai.shen
 * @author chen qi
 * @date Created in 2018-10-01 22:05
 */
//@Aspect
//@Component
public class AopLog {
    /**
     * 切入点
     */
    //@Pointcut("execution(public * com.demo.A.*(..))")
    public void log() {

    }

    /**
     * 环绕操作
     *
     * @param point 切入点
     * @return 原方法返回值
     * @throws Throwable 异常信息
     */
    //@Around("log()")
    public Object aroundLog(ProceedingJoinPoint point) throws Throwable {
    	System.out.println(1);
		Object result = point.proceed();
        return result;
    }

}
