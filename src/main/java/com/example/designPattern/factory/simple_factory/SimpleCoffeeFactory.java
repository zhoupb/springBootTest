package com.example.designPattern.factory.simple_factory;

/**
 * @author: zhoupb
 * @Description: 简单工厂模式
 * @since: version 1.0
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {

        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("不存在");
        }
        return coffee;
    }
}
