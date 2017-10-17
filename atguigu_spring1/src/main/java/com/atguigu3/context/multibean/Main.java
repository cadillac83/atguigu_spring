package com.atguigu3.context.multibean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maxudong on 2017/4/22.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-annotationmulti.xml");
        BeanInvoker invoker = (BeanInvoker) ctx.getBean("beanInvoker");
        invoker.say();
    }
}
