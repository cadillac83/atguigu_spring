package com.atguigu3.spring.spel.dto;


/**
 * Created by maxudong on 2017/3/5.
 */
public class Person {
    private String name;
    private Address address;
    private String city;
    private Car car;
    private String info;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", city='" + city + '\'' +
                ", car=" + car +
                ", info='" + info + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Person(String name, Address address, String city, Car car, String info) {

        this.name = name;
        this.address = address;
        this.city = city;
        this.car = car;
        this.info = info;
    }

    public Person() {

    }
}
