package com.example.designPattern.singleton.demo3;

import java.util.Objects;

/**
 * @author: zhoupb
 * @Description: 懒汉式：线程安全
 * @since: version 1.0
 */
public class OneSingleton {

    private OneSingleton() {
    }

    private static OneSingleton instance;

    // synchronized保证线程安全
    public static synchronized OneSingleton getInstance() {

        // 判断instance是否为null。如果为null。则代表还没有创建Singleton对象
        if (Objects.isNull(instance)) {
            instance = new OneSingleton();
        }
        return instance;
    }
}
