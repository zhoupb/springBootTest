package com.example.designPattern.singleton.demo2;

/**
 * @author: zhoupb
 * @Description: 饿汉式：静态代码块方式
 * @since: version 1.0
 */
public class OneSingleton {

    /**
     * 私有构造方法
     */
    private OneSingleton(){}

    /**
     * 声明Single类型的变量
     */
    private static OneSingleton instance;

    /**
     * 在静态代码块中进行复制
     */
    static {
        instance = new OneSingleton();
    }

    /**
     * 对外提供获取对象的方法
     */
    public static OneSingleton getInstance(){
        return instance;
    }



}
