package com.springmvc.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MultiEnvDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");

        System.out.println("Hello World!");
    }
}
