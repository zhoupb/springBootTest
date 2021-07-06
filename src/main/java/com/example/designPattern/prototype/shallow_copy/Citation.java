package com.example.designPattern.prototype.shallow_copy;

/**
 * @author: zhoupb
 * @Description: 奖状原型类： 浅克隆
 * @since: version 1.0
 */
public class Citation implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name + "获得三好学生奖状");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
