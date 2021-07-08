package com.example.designPattern.decorator;

/**
 * @author: zhoupb
 * @Description: 炒饭类(具体构件角色)
 * @since: version 1.0
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10f, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
