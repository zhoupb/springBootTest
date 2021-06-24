package com.example.designPattern.factory.factory_method;

/**
 * @author: zhoupb
 * @Description: 拿铁咖啡工厂类
 * @since: version 1.0
 */
public class LatteCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
