package org.example;

import net.sf.cglib.proxy.Enhancer;

public class TestCglibProxyFactory {
    public static Object createCglibProxyObj(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        // 提供一个回调函数，代理类的所有方法调用，都会调用 callback
        enhancer.setCallback(new TestCglibProxy());
        return enhancer.create();
    }
}
