package com.atguigu3.spring.spel.dto;

/**
 * Created by maxudong on 2017/3/5.
 */
public class Car {
    private String company;
    private String brand;
    private float price;
    //轮胎的周长
    private double typePerimeter;
    //根据car的价格确定金领和白领
    private String info;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", typePerimeter=" + typePerimeter +
                ", info='" + info + '\'' +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getTypePerimeter() {
        return typePerimeter;
    }

    public void setTypePerimeter(double typePerimeter) {
        this.typePerimeter = typePerimeter;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Car(String company, String brand, float price, double typePerimeter, String info) {

        this.company = company;
        this.brand = brand;
        this.price = price;
        this.typePerimeter = typePerimeter;
        this.info = info;
    }
}
