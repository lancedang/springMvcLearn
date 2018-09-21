package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//目标方法执行前后
public class AroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("目标方法执行前");
        System.out.println("目标方法：" + invocation.getMethod().getName());
        Object methodResult = invocation.proceed();
        System.out.println("目标方法执行后");
        return methodResult;
    }
}
