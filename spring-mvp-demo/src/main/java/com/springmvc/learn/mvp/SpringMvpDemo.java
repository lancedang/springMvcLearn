package com.springmvc.learn.mvp;

import com.springmvc.learn.mvp.bean.IVehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SpringMvpDemo {
    public static void main(String[] args) throws IOException {
        springWarmUp();
    }

    protected static void springWarmUp() throws IOException {

        //解析上下文文件，创建其中定义的bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-context.xml");

        //获取并使用其中的bean
        IVehicle bike = (IVehicle) applicationContext.getBean("bike");
        bike.run();

        IVehicle car = (IVehicle)applicationContext.getBean("car");
        car.run();

        System.in.read();
    }
}
