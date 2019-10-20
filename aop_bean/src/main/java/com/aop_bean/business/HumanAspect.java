package com.aop_bean.business;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class HumanAspect {
    public void before(JoinPoint jp) {
        Signature sig = jp.getSignature(); // AOP가 실행되는 함수나 인수 등의 정보를 가지고 있는 데이터
        Object[] arg = jp.getArgs();
        System.out.println("Before Aspect : {Method=\"" + sig.getName() + "\"" + " argument=\"" + arg[0]+"\"}");
    }

    public void after() {
        System.out.println("After Aspect");
    }

//    public void afterReturning(JoinPoint jp, Product product) {
//        // 메서드 호출이 예외를 내보내지 않고 종료했을 때 동작하는 어드바이스
//        System.out.println("Hello AfterReturning! *** 메서드가 호출된 후에 나옵니다!");
//        Signature sig = jp.getSignature();
//        System.out.println("-----> 메서드명：" + sig.getName());
//        Object[] o = jp.getArgs();
//        System.out.println("-----> 인수：" + o[0]);
//    }
//
////    public void around(ProceedingJoinPoint pjp) throws Throwable {
////        // 메서드 호출 전후에 동작하는 어드바이스
////        System.out.println("Hello Around! before *** 메서드가 호출되기 전에 나옵니다!");
////
////        Signature sig = pjp.getSignature();
////        System.out.println("-----> aop:around 메서드명：" + sig.getName());
////        Product p = (Product) pjp.proceed();
////        System.out.println("Hello Around! after *** 메서드가 호출된 후에 나옵니다!");
////        return p;
////    }
//
//    public void afterThrowing(Throwable ex) {
//        // 메서드 호출이 예외를 던졌을 때 동작하는 어드바이스
//        System.out.println("Hello Throwing! *** 예외가 생기면 나옵니다!");
//        System.out.println("exception value = " + ex.toString());
//    }

}
