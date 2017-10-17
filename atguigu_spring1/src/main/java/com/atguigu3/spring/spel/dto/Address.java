package com.atguigu3.spring.spel.dto;

/**
 * Created by maxudong on 2017/3/5.
 */
public class Address {
    private String city;
    private String street;
    private String province;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
