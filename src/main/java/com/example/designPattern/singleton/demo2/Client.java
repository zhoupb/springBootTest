package com.example.designPattern.singleton.demo2;

/**
 * @author: zhoupb
 * @Description: Client
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {
        OneSingleton instance = OneSingleton.getInstance();

        OneSingleton instance1 = OneSingleton.getInstance();

        System.out.println(instance == instance1); // true
    }
}
