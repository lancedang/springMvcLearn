import aop.AfterAdvice;
import aop.AroundAdvice;
import aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IBookService;
import service.beannameautoproxycreator.BeanNameAutoProxyCreatorService;
import service.impl.BookServiceImpl;

public class AopDemo {

    //不在 resources 目录配置 spring.xml 文件时
    public static void main2(String[] args) {
        //为 业务逻辑 方法执行 AOP 处理
        IBookService bookService = new BookServiceImpl();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(bookService);
        proxyFactory.addAdvice(new BeforeAdvice());
        proxyFactory.addAdvice(new AroundAdvice());
        proxyFactory.addAdvice(new AfterAdvice());

        IBookService proxy = (IBookService)proxyFactory.getProxy();
        proxy.print("test");
    }

    //在 resources 目录配置了 spring.xml 文件时
    public static void main3(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IBookService bookServiceProxy = (IBookService)applicationContext.getBean("bookService");
        bookServiceProxy.print("test");
        bookServiceProxy.say("test");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.refresh();


        BeanNameAutoProxyCreatorService beanNameAutoProxyCreatorServiceImpl1 = (BeanNameAutoProxyCreatorService) annotationConfigApplicationContext.getBean("beanNameAutoProxyCreatorServiceImpl1");
        BeanNameAutoProxyCreatorService beanNameAutoProxyCreatorServiceImpl2 = (BeanNameAutoProxyCreatorService) annotationConfigApplicationContext.getBean("beanNameAutoProxyCreatorServiceImpl2");

        beanNameAutoProxyCreatorServiceImpl1.test("张三");
        beanNameAutoProxyCreatorServiceImpl1.test("王五");
    }
}
