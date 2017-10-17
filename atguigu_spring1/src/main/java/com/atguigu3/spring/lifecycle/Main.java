package com.atguigu3.spring.lifecycle;

import com.atguigu3.spring.lifecycle.dto.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maxudong on 2017/3/5.
 */
public class Main {
    public static void main(String[] args) {
        bean_lifecycle1();
    }

    public static void bean_lifecycle1(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-lifecycle.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        ctx.close(); //关闭容器，执行destroy-method方法
    }

}
