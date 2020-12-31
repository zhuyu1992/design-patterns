package com.creational.builder;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("===========vegMeal=============");
        vegMeal.showItems();
        System.out.println("总价格："+vegMeal.getCost());

        System.out.println("\n");
        System.out.println("\n");

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

        System.out.println("==============nonVegMeal=============");
        nonVegMeal.showItems();
        System.out.println("总价格："+nonVegMeal.getCost());





    }
}
