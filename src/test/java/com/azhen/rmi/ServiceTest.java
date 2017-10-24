package com.azhen.rmi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Azhen
 * @date 2017/10/23
 */
public class ServiceTest {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("rmi-service.xml");
    }
}
