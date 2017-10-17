package com.atguigu3.spring.spel;

import com.atguigu3.spring.spel.dto.Address;
import com.atguigu3.spring.spel.dto.Car;
import com.atguigu3.spring.spel.dto.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maxudong on 2017/3/5.
 */
public class Main {
    public static void main(String[] args) {
        bean_num1();  //使用spel为属性赋一个字面值spel
        bean_num2();  //使用spel调用静态方法或静态属性
        bean_num3();  //1.引用其他对象  通过value 属性spEL 配置Bean 之间的引用关系
    }

    public static void bean_num1(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-spel.xml");
        Address address = (Address) ctx.getBean("address");
        System.out.println(address);
    }

    public static void bean_num2(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-spel.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
    }

    public static void bean_num3(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-spel.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }

}
