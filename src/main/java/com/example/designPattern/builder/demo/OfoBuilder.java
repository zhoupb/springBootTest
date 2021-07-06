package com.example.designPattern.builder.demo;

/**
 * @author: zhoupb
 * @Description: 小黄车建造者
 * @since: version 1.0
 */
public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("铝合金");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
