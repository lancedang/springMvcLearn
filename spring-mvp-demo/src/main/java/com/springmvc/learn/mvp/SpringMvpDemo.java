package com.springmvc.learn.mvp;

import com.springmvc.learn.mvp.bean.InAnimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class SpringMvpDemo {
    public static void main(String[] args) {
        springWarmUp();
    }

    protected static void springWarmUp() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        InAnimal tortoise = (InAnimal) applicationContext.getBean("tortoise");
        tortoise.run();

        InAnimal rabbit = (InAnimal)applicationContext.getBean("rabbit");
        rabbit.run();
    }
}
