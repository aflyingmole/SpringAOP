package test.aop03;

import org.aspectj.lang.ProceedingJoinPoint;

public class UserAdvice {
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long l = System.currentTimeMillis();
        // 메서드 실행전에 수행될 기능
        Object[] args = joinPoint.getArgs();// 메서드에 전달된 파라미터값들 얻어오기
        System.out.println("메서드에 전달된 파라미터값들....");
        for (int i = 0; i <args.length; i++) {
            System.out.println(i + " : " + args[i]);
        }

        Object returnValue = joinPoint.proceed(); // 메서드(핵심로직)가 호출되어 수행됨



        // 메서드 실행후에 수행될 기능
        System.out.println("메서드실행후에 리턴된 값 : " + returnValue);
        int l2 = (int) System.currentTimeMillis();
        int l3 = (int) (l2-l);
        System.out.println("메서드 실행 시간 : " + l3);
        return returnValue;

    }


}
