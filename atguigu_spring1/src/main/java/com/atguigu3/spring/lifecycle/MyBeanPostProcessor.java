package com.atguigu3.spring.lifecycle;

import com.atguigu3.spring.lifecycle.dto.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by maxudong on 2017/3/16.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("前置处理器执行中……,名称为："+beanName+","+beanName);
        if ("car".equals(beanName)){
            //………………
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器执行中……,名称为："+beanName+","+beanName);
        Car car = new Car();
        car.setBrand("Ford");
        return car;
    }
}
