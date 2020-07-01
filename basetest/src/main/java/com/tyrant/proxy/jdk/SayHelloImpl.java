package com.tyrant.proxy.jdk;

/**
 * @author:profiteur
 * @create 2020-06-10 13:29
 **/
public class SayHelloImpl implements ISayHello {
    @Override
    public void say() {
        System.out.println("Hello proxy");
    }
}
