package com.xiaoqi.domain;

public class User {
    private String name;
    private int age;
    private Car car;


    public Car getCar() {
        return car;
    }

    public User(String name, Car car) {
        System.out.println("name+car 构造函数");
        this.name = name;
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User() {
        System.out.println("--------------user 空参构造方法!!!---------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void init() {
        System.out.println("----------init-------------");
    }

    public void destroy() {
        System.out.println("---------destroy-------------");
    }

}
