package com.atguigu.spring.jdbc;

import java.util.List;

/**
 * Created by maxudong on 2017/3/29.
 */
public class testBean {

    /**
     * name : 王五
     * gender : man
     * age : 15
     * height : 140cm
     * addr : {"province":"fujian","city":"quanzhou","code":"300000"}
     * hobby : [{"name":"billiards","code":"1"},{"name":"computerGame","code":"2"}]
     */

    private String name;
    private String gender;
    private int age;
    private String height;
    private AddrBean addr;
    private List<HobbyBean> hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public AddrBean getAddr() {
        return addr;
    }

    public void setAddr(AddrBean addr) {
        this.addr = addr;
    }

    public List<HobbyBean> getHobby() {
        return hobby;
    }

    public void setHobby(List<HobbyBean> hobby) {
        this.hobby = hobby;
    }

    public static class AddrBean {
        /**
         * province : fujian
         * city : quanzhou
         * code : 300000
         */

        private String province;
        private String city;
        private String code;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }

    public static class HobbyBean {
        /**
         * name : billiards
         * code : 1
         */

        private String name;
        private String code;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}
