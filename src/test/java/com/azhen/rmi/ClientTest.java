package com.azhen.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Azhen
 * @date 2017/10/23
 */
public class ClientTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("rmi-client.xml");
        HelloRMIService hms = context.getBean("myClient", HelloRMIService.class);
        System.out.println(hms.getAdd(1,2));
    }
}
