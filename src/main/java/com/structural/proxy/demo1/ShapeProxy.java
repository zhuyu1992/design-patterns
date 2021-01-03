package com.structural.proxy.demo1;

/**
 * @auther: zzzgyu
 */

public class ShapeProxy implements Shape {
    Shape object = null;
    public ShapeProxy(Shape o) {
        this.object = o;
    }

    public void say() {
        befor();
        object.say();
        after();
    }

    public void befor() {
        System.out.println("==========befor========");
    }

    public void after() {
        System.out.println("=======after===========");
    }
}
