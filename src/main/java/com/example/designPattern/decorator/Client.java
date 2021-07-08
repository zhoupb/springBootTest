package com.example.designPattern.decorator;

/**
 * @author: zhoupb
 * @Description: Client
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 点一份炒饭
        FastFood fastFood = new FriedRice();
        System.out.println(fastFood.getDesc() + "  " + fastFood.cost() + "元");

        System.out.println("=============================");

        // 加一个鸡蛋
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc() + "  " + fastFood.cost() + "元");

        System.out.println("=============================");

        // 再加一个鸡蛋
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc() + "  " + fastFood.cost() + "元");

        System.out.println("=============================");

        // 加一个培根
        fastFood = new Bacon(fastFood);
        System.out.println(fastFood.getDesc() + "  " + fastFood.cost() + "元");


    }
}
