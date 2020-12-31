package com.creational.abstractFactory;

/**
 * @auther: zzzgyu
 */

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryName) {
        if (factoryName.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        } else if (factoryName.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        return null;
    }
}
