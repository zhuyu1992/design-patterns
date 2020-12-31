package com.creational.builder;

/**
 * @auther: zzzgyu
 */


//汉堡用纸打包
public abstract class Burger implements Item {
    public Packing packing() {

        return new Wrapper();
    }
}
