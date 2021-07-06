package com.example.designPattern.builder.demo;

import lombok.Data;

/**
 * @author: zhoupb
 * @Description: 指挥者
 * @since: version 1.0
 */
@Data
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildSeat();
        builder.buildFrame();
        return builder.createBike();
    }

}
