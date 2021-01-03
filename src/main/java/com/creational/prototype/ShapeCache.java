package com.creational.prototype;

import java.util.Hashtable;

/**
 * @auther: zzzgyu
 */

public class ShapeCache {
   private static Hashtable<Integer, Shape> hashtable = new Hashtable<Integer, Shape>();

   //返回clone的对象
    public static Shape getShape( Integer id) throws CloneNotSupportedException {
        Shape shape = hashtable.get(id);
        return (Shape) shape.clone();
    }

    //模拟从数据库中取的数据，放到hashtable
    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId(1);
        rectangle.setName("rectangle");
        hashtable.put(rectangle.getId(), rectangle);

        Circle circle = new Circle();
        circle.setId(2);
        circle.setName("circle");
        hashtable.put(circle.getId(), circle);

        Square square = new Square();
        square.setId(3);
        square.setName("square");
        hashtable.put(square.getId(), square);

    }


}
