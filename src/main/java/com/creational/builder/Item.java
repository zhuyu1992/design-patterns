package com.creational.builder;

/**
 * 一件商品
 */
public interface Item {
    //商品ming
    public String name();

    //用什么打包
    public Packing packing();

    //商品价格
    public float price();

}
