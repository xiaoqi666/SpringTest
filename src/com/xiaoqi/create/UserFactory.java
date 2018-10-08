package com.xiaoqi.create;

import com.xiaoqi.domain.User;

public class UserFactory {
    public static User createUser() {
        System.out.println("----------------静态工厂方式创建User对象----------------");
        return new User();
    }

    public User createUser2() {
        System.out.println("----------------动态工厂方式创建User对象----------------");
        return new User();
    }


}
