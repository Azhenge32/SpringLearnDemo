package com.azhen.rmi;

/**
 * @author Azhen
 * @date 2017/10/23
 */
public class HelloRMIServiceImpl implements HelloRMIService {
    public int getAdd(int a, int b) {
        return a + b;
    }
}
