package com.creational.singleton;

/**
 * @auther: zzzgyu
 *
 * 饿汉式 线程安全
 */

public class Singleton {
    private Singleton() {

    }

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
       return singleton;

    }
}
