package com.atguigu3.spring.helloworld;

import com.atguigu3.spring.helloworld.dto.Car;
import com.atguigu3.spring.helloworld.dto.HelloWorld;
import com.atguigu3.spring.helloworld.dto.User;
import com.atguigu3.spring.ref.Action;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maxudong on 2017/3/5.
 */
public class Main {
    public static void main(String[] args) {

        property();   //通过属性注入设置值
        constructor();  //通过构造器注入设置值
        more_constructor_special();  //多个构造器注入及特殊符号
        bean_ref();    //通过ref属性值指定当前属性指向哪个bean
        bean_inner();  //内部bean
        bean_leverconnect(); //级联属性
        bean_collection(); //装配集合属性
        bean_collection2(); //装配集合属性
        bean_parent(); //测试p标签
    }


    public static void property(){
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setUser("Tom");
//		helloWorld.hello();
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-property.xml");

        //2. 从 IOC 容器中获取 bean 的实例
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld2");

        //根据类型来获取 bean 的实例: 要求在  IOC 容器中只有一个与之类型匹配的 bean, 若有多个则会抛出异常.
        //一般情况下, 该方法可用, 因为一般情况下, 在一个 IOC 容器中一个类型对应的 bean 也只有一个.
//		HelloWorld helloWorld1 = ctx.getBean(HelloWorld.class);

        //3. 使用 bean
        helloWorld.hello();
    }

    public static void constructor(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-constructor.xml");
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld3");
        helloWorld.hello();
    }

    public static void more_constructor_special(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-constructor.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
    }

    public static void bean_ref(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-ref.xml");
        User user = (User) ctx.getBean("user");
        System.out.println(user);
    }

    public static void bean_inner(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-inner.xml");
        User user = (User) ctx.getBean("user");
        System.out.println(user);
    }

    public static void bean_collection(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-collection.xml");
        User user = (User) ctx.getBean("user");
        System.out.println(user);
    }

    public static void bean_collection2(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-collection2.xml");
        User user = (User) ctx.getBean("user2");
        System.out.println(user);
    }

    public static void bean_leverconnect(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-level_connect.xml");
        Action action = (Action) ctx.getBean("action");
        action.execute();
    }

    public static void bean_parent(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-parent.xml");
        User user = (User) ctx.getBean("user3");
        System.out.println(user);
    }
}
