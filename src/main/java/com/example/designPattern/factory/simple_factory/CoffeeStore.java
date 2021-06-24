package com.example.designPattern.factory.simple_factory;

/**
 * @author: zhoupb
 * @Description: 咖啡店
 * @since: version 1.0
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
