package com.creational.singleton;

/**
 * @auther: zzzgyu
 *
 * 懒汉式 线程安全 静态内部类
 */

public class Singleton3 {
    private Singleton3() {

    }

    private static class Singleton3Holder{
        private static Singleton3 singleton3 = new Singleton3();
    }
    public static Singleton3 getInstance() {
           return Singleton3Holder.singleton3;
    }

}
