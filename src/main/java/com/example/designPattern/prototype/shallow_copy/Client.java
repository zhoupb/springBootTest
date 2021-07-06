package com.example.designPattern.prototype.shallow_copy;

/**
 * @author: zhoupb
 * @Description: 奖状原型类： 浅克隆 测试类
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Citation citation = new Citation();
        Citation clone = citation.clone();

        citation.setName("张三");
        clone.setName("李四");

        citation.show();
        clone.show();
    }
}
