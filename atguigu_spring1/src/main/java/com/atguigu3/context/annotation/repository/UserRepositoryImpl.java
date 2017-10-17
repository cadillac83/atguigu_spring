package com.atguigu3.context.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by maxudong on 2017/3/16.
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
    public void save() {
        System.out.println("UserRepository Save……");
    }
}
