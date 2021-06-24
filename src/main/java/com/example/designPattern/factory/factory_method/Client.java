package com.example.designPattern.factory.factory_method;


/**
 * @author: zhoupb
 * @Description: 工厂方法模式  测试类
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {

        // 工厂方法模式测试
        CoffeeStore store = new CoffeeStore();
        CoffeeFactory coffeeFactory = new LatteCoffeeFactory();
        store.setCoffeeFactory(coffeeFactory);
        Coffee coffee = store.orderCoffee();
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
    }
}
