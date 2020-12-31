package com.creational.factory;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal cat = animalFactory.getAnimal("cat");
        cat.name();
    }
}
