package com.atguigu3.spring.factory;

import com.atguigu3.spring.factory.dto.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maxudong on 2017/3/16.
 */
public class InstanceCarFactory {
    private Map<String ,Car> cars = null;
    public InstanceCarFactory(){
        cars = new HashMap<String, Car>();
        cars.put("Audi",new Car("Audi",300000));
        cars.put("Ford",new Car("Ford",400000));
    }
    public Car getCar(String brand){
        return cars.get(brand);
    }
}
