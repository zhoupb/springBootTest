package com.example.designPattern.proxy.static_proxy;

/**
 * @author: zhoupb
 * @Description: Client
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {

        ProxyPoint proxyPoint = new ProxyPoint();

        proxyPoint.sell();
    }
}
