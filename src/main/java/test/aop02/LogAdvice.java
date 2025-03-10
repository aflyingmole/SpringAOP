package test.aop02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        // 메서드 실행전에 수행될 기능
        Object[] args = joinPoint.getArgs();// 메서드에 전달된 파라미터값들 얻어오기
        System.out.println("메서드에 전달된 파라미터값들....");
        for (int i = 0; i <args.length; i++) {
            System.out.println(i + " : " + args[i]);
        }

        Object returnValue = joinPoint.proceed(); // 메서드(핵심로직)가 호출되어 수행됨



        // 메서드 실행후에 수행될 기능
        System.out.println("메서드실행후에 리턴된 값 : " + returnValue);
        return returnValue;

    }
}
