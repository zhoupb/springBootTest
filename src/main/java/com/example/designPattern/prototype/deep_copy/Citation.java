package com.example.designPattern.prototype.deep_copy;

import java.io.Serializable;

/**
 * @author: zhoupb
 * @Description: 奖状原型类： 深克隆
 * @since: version 1.0
 */
public class Citation implements Cloneable, Serializable {

    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }
    public void show(){
        System.out.println(stu.getName() + "获得三好学生奖状");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
