package com.azhen.invoker;

/**
 * @author Azhen
 * @date 2017/10/24
 */
public class HttpInvokertestImpl implements HttpInvokerTestI {
    public String getTestPo(String desp) {
        return "getTestPo " + desp;
    }
}
