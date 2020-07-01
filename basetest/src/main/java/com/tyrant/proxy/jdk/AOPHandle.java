package com.tyrant.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author:profiteur
 * @create 2020-06-10 13:30
 **/
public class AOPHandle implements InvocationHandler {
    private Object obj;
    AOPHandle(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置");
        Object ret = method.invoke(obj,args);
        System.out.println("后置");
        return ret;
    }
}
