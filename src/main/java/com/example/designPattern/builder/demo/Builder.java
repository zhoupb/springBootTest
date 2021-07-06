package com.example.designPattern.builder.demo;

/**
 * @author: zhoupb
 * @Description: 建造者
 * @since: version 1.0
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

    public Bike construct() {
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}
