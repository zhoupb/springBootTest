package com.example.designPattern.proxy.static_proxy;

/**
 * @author: zhoupb
 * @Description: 火车站
 * @since: version 1.0
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("会车站卖票");
    }
}
