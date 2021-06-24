package com.example.designPattern.factory.factory_method;


/**
 * @author: zhoupb
 * @Description: 咖啡店
 * @since: version 1.0
 */
public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        return coffee;
    }

}
