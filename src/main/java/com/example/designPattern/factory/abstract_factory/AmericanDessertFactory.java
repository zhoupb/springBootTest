package com.example.designPattern.factory.abstract_factory;

/**
 * @author: zhoupb
 * @Description: 美式风味甜品工厂类
 * @since: version 1.0
 */
public class AmericanDessertFactory implements DessertFactory{

    @Override
    public Dessert createDessert() {
        return new MatchMousse();
    }

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
