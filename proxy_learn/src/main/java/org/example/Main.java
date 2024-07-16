package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        // Invocation 动态代理
        System.out.println("Invocation动态代理");
        TestInterface test = new Test();
        InvocationHandler testHandler = new TestHandler(test);
        TestInterface o = (TestInterface)Proxy.newProxyInstance(testHandler.getClass().getClassLoader(), test.getClass().getInterfaces(), testHandler);
        o.doThing();
        System.out.println("下面是CGLIB动态代理");
        // CGLIB 动态代理
        Test testCglib =  (Test)TestCglibProxyFactory.createCglibProxyObj(test.getClass());
        testCglib.doThing();
    }
}