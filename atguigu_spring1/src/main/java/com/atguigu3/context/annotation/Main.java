package com.atguigu3.context.annotation;

import com.atguigu3.context.annotation.controller.UserController;
import com.atguigu3.context.annotation.repository.UserRepository;
import com.atguigu3.context.annotation.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maxudong on 2017/3/5.
 */
public class Main {
    public static void main(String[] args) {
        bean_IOC(); //测试注解

    }

    public static void bean_IOC(){
        //1. 创建 Spring 的 IOC 容器  默认会初始化所有的bean
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-annotation.xml");
        TestObject to = (TestObject)ctx.getBean("testObject");
        System.out.println(to);

        UserController userController = (UserController)ctx.getBean("userController");
        System.out.println(userController);

        UserService userService = (UserService)ctx.getBean("userService");
        System.out.println(userService);

        UserRepository userReposition = (UserRepository)ctx.getBean("userRepository");  //对于实现接口的类，要指定具体名称
        System.out.println(userReposition);
    }


}
