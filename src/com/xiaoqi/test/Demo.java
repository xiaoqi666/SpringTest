package com.xiaoqi.test;

import com.xiaoqi.create.UserFactory;
import com.xiaoqi.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void test() {
        //创建容器对象
        //ClassPathXmlApplicationContext 从类路径下加载配置文件:ClassPathXmlApplicationContext
        //从硬盘绝对类型下加载配置文件:FileSystemXmlApplicationContext
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        //向容器要USer对象,空参构造方式创建User对象(方式1)
        User user = (User) ac.getBean("user");
        // User user2 = (User) ac.getBean("user");
        //打印User对象
        System.out.println(user);
        // System.out.println(user2);//user1与user2  地址相同


        //静态工厂方式创建User对象(方式2)
        User user3 = (User) ac.getBean("user2");
        System.out.println(user3);

        //动态实例工厂创建User对象(方式3)
        UserFactory userFactory = (UserFactory) ac.getBean("userFactory");
        User user4 = userFactory.createUser2();
        System.out.println(user4);
        System.out.println(((User) ac.getBean("userone")).getName());
        System.out.println(((User) ac.getBean("usertwo")).getName());
        System.out.println(((User) ac.getBean("userThree")).getName());
        System.out.println(((User) ac.getBean("userFour")).getName());
        System.out.println(ac.getBean("cb"));
//        ((ClassPathXmlApplicationContext) ac).close();
    }

}
