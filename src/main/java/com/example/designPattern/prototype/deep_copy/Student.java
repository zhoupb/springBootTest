package com.example.designPattern.prototype.deep_copy;

import java.io.Serializable;

/**
 * @author: zhoupb
 * @Description: 学生类
 * @since: version 1.0
 */
public class Student implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
