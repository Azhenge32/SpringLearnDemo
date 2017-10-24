package com.azhen.invoker;

import com.azhen.rmi.HelloRMIService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Azhen
 * @date 2017/10/23
 */
public class ClientTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("invoker-client.xml");
        HttpInvokerTestI httpInvokerTestI = (HttpInvokerTestI) context.getBean("remoteService");
        System.out.println(httpInvokerTestI.getTestPo("ddddd"));
    }
}
