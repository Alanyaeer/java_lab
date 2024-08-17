package com.example.aopoperation.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopTest {
    private static final Logger logger = LoggerFactory.getLogger(AopTest.class);
    @Pointcut("execution(* com.example.aopoperation.*.*(..))")
    public void aopFn(){}

    @Around("aopFn()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        logger.info(joinPoint.getSignature().getName());
        try {
            // 执行方法
            Object result = joinPoint.proceed();
            // 方法结束时间
            long endTime = System.currentTimeMillis();
            // 计算方法执行时间并打印
            logger.info("方法执行时间：" + (endTime - startTime) + " ms");

            return result;
        } catch (Throwable throwable) {
            // 方法结束时间
            long endTime = System.currentTimeMillis();
            // 计算方法执行时间并打印
            logger.info("方法执行时间：" + (endTime - startTime) + " ms，方法抛出异常");
            throw throwable;
        }
    }
}
