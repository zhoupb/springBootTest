package com.example.designPattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: zhoupb
 * @Description: 获取代理对象的工厂类（它不是代理类对象，代理类对象是在程序运行中动态生成的，我们是看不到的）
 * @since: version 1.0
 */
public class ProxyFactory {

    /**
     * 声明目标对象
     */
    private TrainStation station = new TrainStation();

    /**
     * 获取代理对象的方法
     */
    public SellTickets getProxyObject() {

        /**
         * 参数介绍：
         *
         * ClassLoader loader: 类加载器，用于加载代理类：可以通过目标对象获取
         * Class<?>[] interfaces: 代理类实现的接口的字节码对象：以通过目标对象获取
         * InvocationHandler h：代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy : 代理对象，和proxyObject是同一个对象，在invoke方法中基本不用
                     * @param method：调用的方法(对接口中的方法进行封装的method对象)
                     * @param args：调用方法的实际参数
                     * @return Object：调用方法的返回值
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("invoke方法执行了。。。");
                        // 方法增强
                        System.out.println("代售点收取一些费用(JDK动态代理)");
                        // 执行目标对象的方法
                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                }
        );

        return proxyObject;
    }

}
