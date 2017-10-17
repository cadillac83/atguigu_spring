package com.atguigu3.spring.helloworld.dto;

/**
 * Created by maxudong on 2017/3/5.
 */
public class Company {
    private String company;

    @Override
    public String toString() {
        return "Company{" +
                "company='" + company + '\'' +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
