package com.structural.proxy.demo2;

import java.lang.reflect.Proxy;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main( String[] args ) {
        Shape proxyInstance = (Shape) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{Shape.class}, new ShapeProxy(new Rectangle() ));
        proxyInstance.say();
        proxyInstance.speak();
    }
}
