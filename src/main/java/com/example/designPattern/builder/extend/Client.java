package com.example.designPattern.builder.extend;


/**
 * @author: zhoupb
 * @Description: Client
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {

        Phone phone = new Phone.Builder()
                .cpu("cpu")
                .mainboard("主板")
                .memory("内存")
                .screen("屏幕")
                .build();
        System.out.println(phone);
    }
}
