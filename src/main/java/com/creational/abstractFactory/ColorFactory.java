package com.creational.abstractFactory;

/**
 * @auther: zzzgyu
 */

public class ColorFactory extends AbstractFactory {
    public Shape getShape(String shape) {
        return null;
    }

    public Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("black")) {
            return new Black();
        }
        return null;
    }
}
