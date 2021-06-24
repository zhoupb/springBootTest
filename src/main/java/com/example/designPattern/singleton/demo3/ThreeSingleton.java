package com.example.designPattern.singleton.demo3;

/**
 * @author: zhoupb
 * @Description: 懒汉式：静态内部类方式
 *
 * 1：定义：由于JVM在加载外部类的过程中，是不会加载静态内部类的，只有内部类的属性和方法被调用时才会被加载，并且初始化静态属性。静态属性被static修饰，保证只被实例化一次，并且严格保证实例化顺序。
 * 2：说明：第一次加载ThreeSingleton类时不会初始化INSTANCE,只有第一次调用geInstance()方法，JVM才会加载ThreeSingletonHolder并且初始化INSTANCE,既保证了线程安全，也保证了ThreeSingleton的唯一性。
 * 3：小结：保证线程安全，没有任何性能影响，没有任何空间浪费。
 * @since: version 1.0
 */
public class ThreeSingleton {

    private ThreeSingleton() {
    }

    /**
     * 定义一个静态内部类
     */
    private static class ThreeSingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final ThreeSingleton INSTANCE = new ThreeSingleton();
    }

    /**
     * 公共访问方法
     */
    public static ThreeSingleton getInstance() {
        return ThreeSingletonHolder.INSTANCE;
    }
}
