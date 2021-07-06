package com.example.designPattern.proxy.jdk_proxy;

/**
 * @author: zhoupb
 * @Description: Client
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 创建代理对象工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        // 通过代理工厂获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        // 调用代理对象的卖票方法
        proxyObject.sell();
    }
}
