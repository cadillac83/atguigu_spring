package com.atguigu3.context.annotation2.service;

import com.atguigu3.context.annotation2.TestObject;
import com.atguigu3.context.annotation2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by maxudong on 2017/3/16.
 */
@Service
public class UserService {
    @Autowired
    @Qualifier("userRepositoryImpl")   //还可以加入到参数里面
    private UserRepository userRepository;

    @Autowired(required = false)    //这个标记，匹配不到也不会报错
    private TestObject testObject;

    public void add(){
        System.out.println("UserService222 add……");
        userRepository.save();
        System.out.println(testObject);
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
