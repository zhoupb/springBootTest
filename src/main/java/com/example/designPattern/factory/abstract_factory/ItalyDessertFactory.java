package com.example.designPattern.factory.abstract_factory;

/**
 * @author: zhoupb
 * @Description: 意大利式甜品工厂类
 * @since: version 1.0
 */
public class ItalyDessertFactory implements DessertFactory {

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
