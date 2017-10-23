package com.azhen.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Azhen
 * @date 2017/10/23
 */
public class SpringJDBCTest {
    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("jdbc.xml");
        UserService userService = (UserService)act.getBean("userService");
        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setSex("男");
        userService.save(user);

        List<User> users = userService.getUsers();
        for (User item : users) {
            System.out.println(item.getName());
        }
    }
}
