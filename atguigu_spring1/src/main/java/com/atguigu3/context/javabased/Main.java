package com.atguigu3.context.javabased;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maxudong on 2017/4/22.
 */
public class Main {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-annotationjavabase.xml");
        Store store= (Store) ctx.getBean("stringStore");
        System.out.println(store.getClass().getName());
    }

    public static void test2(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-annotationjavabase.xml");
        Store store= (Store) ctx.getBean("intStore");
        System.out.println(store.getClass().getName());
    }
}

