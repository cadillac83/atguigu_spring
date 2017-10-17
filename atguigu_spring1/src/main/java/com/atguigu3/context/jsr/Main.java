package com.atguigu3.context.jsr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maxudong on 2017/4/22.
 */
public class Main {
    public static void main(String[] args) {
//        JSR150();
        JSR330();
    }

    public static void JSR150(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-annotationjsr.xml");
        JsrServie1 jsrServie1 = (JsrServie1) ctx.getBean("jsrServie1");
        jsrServie1.save();
    }

    /**
     * jsr330标准注解(依赖注入注解)，扫描方式与Spring注解一致，需要依赖javax.inject包
     */
    public static void JSR330(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-annotationjsr.xml");
        JsrServie2 jsrServie2 = (JsrServie2) ctx.getBean("jsrServie2");
        jsrServie2.save();
    }
}
