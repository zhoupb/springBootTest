package com.example.designPattern.factory.simple_factory;

/**
 * @author: zhoupb
 * @Description: 简单工厂模式  测试类
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {

        // 简单工厂模式
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
