package com.atguigu3.spring.factorybean;

import com.atguigu3.spring.factorybean.dto.Car;
import org.springframework.beans.factory.FactoryBean;

/**什么时候用factorybean：
 *
 * Created by maxudong on 2017/3/16.
 */
public class CarFactoryBean implements FactoryBean{
    private String brand;

    //返回bean对象
    public Car getObject() throws Exception {
        return new Car(brand,5000000);
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return true;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
