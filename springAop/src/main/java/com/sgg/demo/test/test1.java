package com.sgg.demo.test;

import com.sgg.demo.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("conf/advice.xml");
        UserDao userDao = ac.getBean("proxy", UserDao.class);
        userDao.saveUser();
        userDao.deleteUser();
        userDao.updateUser();
    }
}

