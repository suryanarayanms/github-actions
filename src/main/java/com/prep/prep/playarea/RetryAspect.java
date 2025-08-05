package com.prep.prep.playarea;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;


@Aspect
public class RetryAspect {

    @Around("execution(* com.prep.prep.playarea.UnpredictableService(..))")
    public void aspectControl(MethodInvocationProceedingJoinPoint proceedingJoinPoint) {
        int maxAttempt = 3;
        int attemptCount = 0;
        while (attemptCount<maxAttempt){
            try{
                System.out.println("Attempt number: " + (attemptCount + 1));
                proceedingJoinPoint.proceed();
            } catch (Throwable e ) {
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }
        System.out.println("Attemps exhausted after " + maxAttempt + " attempts.");
    }

}
