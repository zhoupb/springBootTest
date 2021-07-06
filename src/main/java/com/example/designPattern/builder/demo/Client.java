package com.example.designPattern.builder.demo;


/**
 * @author: zhoupb
 * @Description: Client
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {

        // 摩拜单车
        Director director = new Director(new MobileBuilder());
        Bike mobileBike = director.construct();
        System.out.println(mobileBike.getFrame());
        System.out.println(mobileBike.getSeat());
        System.out.println("====================================");
        // 小黄车
        Director director1 = new Director(new OfoBuilder());
        Bike ofoBike = director1.construct();
        System.out.println(ofoBike.getFrame());
        System.out.println(ofoBike.getSeat());
    }
}
