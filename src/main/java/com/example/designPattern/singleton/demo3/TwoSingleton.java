package com.example.designPattern.singleton.demo3;

import java.util.Objects;

/**
 * @author: zhoupb
 * @Description: 懒汉式：双重检查锁方式
 * @since: version 1.0
 */
public class TwoSingleton {

    private TwoSingleton() {
    }

    /**
     * volatile关键字的双重检查锁模式，能够保证线程安全，也不会有性能问题；
     *
     *
     */
    private static volatile TwoSingleton instance;

    public static TwoSingleton getInstance() {
        // 第一次判断，如果instance不为null，不进入抢锁阶段，直接返回
        if (Objects.isNull(instance)) {
            synchronized (OneSingleton.class) {
                // 抢到锁之后，再次判断是否为空
                if (Objects.isNull(instance)) {
                    instance = new TwoSingleton();
                }
            }
        }
        return instance;
    }
}
