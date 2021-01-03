package com.creational.prototype;

/**
 * @auther: zzzgyu
 */
//对象复制一定要加接口 Cloneable
public abstract class Shape implements Cloneable {
    String name;
    Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
