package com.structural.proxy.demo1;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main( String[] args ) {
        Rectangle rectangle = new Rectangle();
        ShapeProxy shapeProxy = new ShapeProxy(rectangle);
        shapeProxy.say();
    }
}
