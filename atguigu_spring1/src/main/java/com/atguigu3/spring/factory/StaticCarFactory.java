package com.atguigu3.spring.factory;

import com.atguigu3.spring.factory.dto.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法：直接调用某一个类的静态方法就可以返回bean的实例
 * Created by maxudong on 2017/3/16.
 */
public class StaticCarFactory {
    private static Map<String,Car> cars = new HashMap<String, Car>();
    static {
        cars.put("Audi",new Car("audi",300000));
        cars.put("Ford",new Car("ford",400000));
    }

    public static Car getCar(String name){
        return cars.get(name);
    }
}
