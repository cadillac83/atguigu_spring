package com.atguigu3.spring.autowire;

import com.atguigu3.spring.autowire.dto.Address;
import com.atguigu3.spring.autowire.dto.Car;
import com.atguigu3.spring.autowire.dto.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * Created by maxudong on 2017/3/5.
 */
public class Main {
    public static void main(String[] args) {
//        bean_auto(); //自动装配
//        bean_relation(); //bean的继承测试
//        bean_dependon(); //bean的依赖测试
//        bean_scope();//bean作用域
        bean_jdbcProperty();//测试引用外部文件
    }

    public static void bean_auto(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-autowire.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }

    public static void bean_relation(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-relation.xml");
        Address address = (Address) ctx.getBean("address2");
        System.out.println(address);
    }

    public static void bean_dependon(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-relation.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }

    public static void bean_scope(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-scope.xml");
        Car car = (Car) ctx.getBean("car");
        Car car2 = (Car) ctx.getBean("car");
        System.out.println(car==car2);
    }

    public static void bean_jdbcProperty(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-jdbcProperty.xml");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
    }
}
