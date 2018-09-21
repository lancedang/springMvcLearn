package aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

//方法执行前
public class BeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before advice");
        System.out.println("方法名：" + method.getName());
        System.out.println("方法所属类：" + target.getClass().getName());
    }
}
