package com.creational.prototype;

/**
 * @auther: zzzgyu
 * 原型模式  创建重复对象
 */

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
            ShapeCache.loadCache();
        Shape shape = ShapeCache.getShape(1);
        Shape shape2 = ShapeCache.getShape(1);
        Shape shape3 = ShapeCache.getShape(1);
        System.out.println(shape.hashCode());
        System.out.println(shape2.hashCode());
        System.out.println(shape3.hashCode());
        System.out.println(shape.getName());
    }
}
