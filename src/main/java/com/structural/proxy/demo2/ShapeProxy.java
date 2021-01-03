package com.structural.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auther: zzzgyu
 */

public class ShapeProxy implements InvocationHandler {
    Object target;
    public ShapeProxy(Shape shape) {

        this.target = shape;

    }

    public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable {
        befor();
        method.invoke(target, args);
        after();
        return null;
    }

    public void befor() {
        System.out.println("Proxy=========befor()");
    }

    public void after() {
        System.out.println("Proxy==========after()");
    }
}
