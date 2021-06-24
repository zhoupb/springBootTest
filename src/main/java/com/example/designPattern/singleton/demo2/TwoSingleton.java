package com.example.designPattern.singleton.demo2;

/**
 * @author: zhoupb
 * @Description: 饿汉式：枚举方式
 *
 * 1：定义：因为枚举是线程安全的，并且只会被加载一次，而且枚举类型是所有单例模式中唯一一个不会被破坏的单例模式。
 * @since: version 1.0
 */
public enum TwoSingleton {

    INSTANCE;
}
