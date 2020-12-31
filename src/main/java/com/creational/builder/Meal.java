package com.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: zzzgyu
 */

public class Meal {
    List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();

        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("商品名称:"+item.name()+",打包方式："+item.packing().pack()+"，价格："+item.price());
        }
    }
}
