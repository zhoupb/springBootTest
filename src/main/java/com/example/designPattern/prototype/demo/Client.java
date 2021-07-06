package com.example.designPattern.prototype.demo;


/**
 * @author: zhoupb
 * @Description: Client
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        // 创建一个原型类对象
        RealizeType realizeType = new RealizeType();

        // 对象克隆
        RealizeType clone = realizeType.clone();

        System.out.println("原型对象和克隆对象是否是同一个对象？" + (realizeType == clone)); // false


    }
}
