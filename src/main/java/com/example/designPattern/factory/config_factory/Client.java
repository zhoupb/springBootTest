package com.example.designPattern.factory.config_factory;


/**
 * @author: zhoupb
 * @Description: Client
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");

        Coffee latte = CoffeeFactory.createCoffee("latte");

        System.out.println(american.getName());

        System.out.println(latte.getName());

    }
}
