package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TestHandler implements InvocationHandler {
    private Object object;
    public TestHandler(Object obj){
        object = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行前。。。");
        Object invoke = method.invoke(object, args);
        System.out.println("执行后。。。");

        return invoke;
    }
}
