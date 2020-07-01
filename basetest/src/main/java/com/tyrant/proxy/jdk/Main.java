package com.tyrant.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author:profiteur
 * @create 2020-06-10 13:33
 **/
public class Main {
    public static void main(String[] args){
        SayHelloImpl sayHello = new SayHelloImpl();
        AOPHandle aopHandle = new AOPHandle(sayHello);
        ISayHello sayHelloi = (ISayHello) Proxy.newProxyInstance(SayHelloImpl.class.getClassLoader(),new Class[]{ISayHello.class},aopHandle);
        sayHelloi.say();
     }
}
