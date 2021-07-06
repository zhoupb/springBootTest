package com.example.designPattern.builder.demo;

/**
 * @author: zhoupb
 * @Description: 摩拜单车建造者
 * @since: version 1.0
 */
public class MobileBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("金刚车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
