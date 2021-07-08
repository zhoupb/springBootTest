package com.example.designPattern.decorator;

/**
 * @author: zhoupb
 * @Description: 炒面类(具体构件角色)
 * @since: version 1.0
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12f, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
