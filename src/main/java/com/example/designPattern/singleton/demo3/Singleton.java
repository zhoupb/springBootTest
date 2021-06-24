package com.example.designPattern.singleton.demo3;

import java.util.Objects;

/**
 * @author: zhoupb
 * @Description: 懒汉式：线程不安全
 * @since: version 1.0
 */
public class Singleton {

    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {

        // 判断instance是否为null。如果为null。则代表还没有创建Singleton对象
        if (Objects.isNull(instance)) {
            // 如果是多线程的情况下，存在线程不安全问题；当线程1在此等待，这时线程2也获取到了cpu的执行权，也会进入改判断，也会去创建一个对象；
            instance = new Singleton();
        }
        return instance;
    }
}
