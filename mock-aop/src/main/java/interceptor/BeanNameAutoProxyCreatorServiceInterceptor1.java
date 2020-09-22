package interceptor;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import service.IBookService;
import service.beannameautoproxycreator.BeanNameAutoProxyCreatorService;

import java.lang.reflect.Method;

@Slf4j
public class BeanNameAutoProxyCreatorServiceInterceptor1 implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Method method = methodInvocation.getMethod();
        Object aThis = methodInvocation.getThis();

        if (aThis instanceof BeanNameAutoProxyCreatorService) {
            log.info("before interceptor 1");
            methodInvocation.proceed();
        }
        return null;
    }
}
