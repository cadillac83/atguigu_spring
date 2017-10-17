package com.atguigu3.context.annotation2.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by maxudong on 2017/3/16.
 */

/**
 * 如果只是UserRepositoryImpl  实现 UserRepository  则可以直接 @Repository
 * 如UserRepositoryImpl 和 UserJdbcRepository 同时实现 UserRepository 则对每个bean进行命名
 * 和 setXXXX Bean 名字一致如：setUserRepository，否则编译报错，@Repository("userRepository")
 * 也可以不用上述，在具体使用bean的时候  具体分配，参照UserService   @Qualifier("userRepositoryImpl")
 */
//@Repository
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
    public void save() {
        System.out.println("UserRepository222 Save……");
    }
}
