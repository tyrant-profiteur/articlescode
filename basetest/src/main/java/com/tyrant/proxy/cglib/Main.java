package com.tyrant.proxy.cglib;

/**
 * @author:profiteur
 * @create 2020-06-10 13:53
 **/
public class Main {
    public static void main(String[] args){
        CglibProxy cglibProxy = new CglibProxy();
        SayHello sayHello = (SayHello) cglibProxy.getProxy(SayHello.class);
        sayHello.sya();
     }
}
