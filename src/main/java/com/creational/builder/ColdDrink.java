package com.creational.builder;

/**
 * @auther: zzzgyu
 */

//冷饮用玻璃瓶打包
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }
}
