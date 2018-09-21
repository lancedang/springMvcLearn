package com.springmvc.learn.env;

import com.springmvc.learn.env.runner.InAnimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class MultiEnvApp {
    public static void main(String[] args) {
        springWarmUp();
    }

    protected static void springWarmUp() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        InAnimal tortoise = (InAnimal) applicationContext.getBean("tortoise");
        tortoise.run();

        InAnimal rabbit = (InAnimal)applicationContext.getBean("rabbit");
        rabbit.run();
    }
}
