package aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

//成功返回
public class AfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("AfterAdvice 方法执行完成了");
        System.out.println("方法名：" + method.getName());
        System.out.println("方法所属类：" + o1.getClass().getName());
    }
}
