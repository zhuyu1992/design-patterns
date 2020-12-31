package com.creational.abstractFactory;

/**
 * @auther: zzzgyu
 */

public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String shape) {

        if (shape==null) {
            return null;
        }
        if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        return null;
    }

    public Color getColor(String color) {
        return null;
    }
}
