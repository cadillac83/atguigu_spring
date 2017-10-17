package com.atguigu3.spring.lifecycle.dto;

/**
 * Created by maxudong on 2017/3/16.
 */
public class Car {
    private String brand;
    public Car() {
        System.out.println("Car's Constructor");
    }

    public void init(){
        System.out.println("init………………");
    }

    public void destroy(){
        System.out.println("destroy………………");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
