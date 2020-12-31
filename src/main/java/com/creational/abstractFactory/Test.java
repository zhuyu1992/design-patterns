package com.creational.abstractFactory;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main(String[] args) {
        //获取工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //得到工厂的产品
        Shape cirlce = shapeFactory.getShape("circle");

        //产品的使用
        cirlce.draw();
    }
}
