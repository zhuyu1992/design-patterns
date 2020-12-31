package com.creational.singleton;

/**
 * @auther: zzzgyu
 */

public class Test {
    public static void main(String[] args) {
      /*  Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(instance2);*/

       /* Singleton2 singleton2 = Singleton2.getSingleton2();
        Singleton2 singleton21 = Singleton2.getSingleton2();
        System.out.println(singleton2);
        System.out.println(singleton21);*/

      /*  Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
*/

        Singleton4 instance = Singleton4.INSTANCE;
        Singleton4 instance2 = Singleton4.INSTANCE;
        Singleton4 instance3 = Singleton4.INSTANCE;
        String h = Singleton4.INSTANCE.H;
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance3);
        instance.say();


    }
}
