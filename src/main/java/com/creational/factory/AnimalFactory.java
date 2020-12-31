package com.creational.factory;

/**
 * @auther: zzzgyu
 */

public class AnimalFactory {

    public Animal getAnimal(String name) {
        if (name == null) {
            return null;
        }

        if (name == "cat") {
            return new Cat();
        } else if (name == "dog") {
            return new Dog();
        }else {
            return new Mouse();
        }
    }
}
