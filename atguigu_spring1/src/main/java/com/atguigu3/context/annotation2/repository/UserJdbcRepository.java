package com.atguigu3.context.annotation2.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by maxudong on 2017/3/17.
 */
@Repository
public class UserJdbcRepository implements UserRepository{
    public void save() {
        System.out.println("UserJdbcRepository222  save……");
    }
}
