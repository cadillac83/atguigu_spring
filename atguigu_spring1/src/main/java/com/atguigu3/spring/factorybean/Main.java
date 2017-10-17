package com.atguigu3.spring.factorybean;


import com.atguigu3.spring.factorybean.dto.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maxudong on 2017/3/5.
 */
public class Main {
    public static void main(String[] args) {
        bean_factorybean();
    }

    public static void bean_factorybean(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

    }

}
