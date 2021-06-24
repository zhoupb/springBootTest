package com.example.designPattern.factory.factory_method;

/**
 * @author: zhoupb
 * @Description: 美式咖啡工厂类
 * @since: version 1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
