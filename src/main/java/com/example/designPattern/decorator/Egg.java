package com.example.designPattern.decorator;

/**
 * @author: zhoupb
 * @Description: 鸡蛋类(具体的装饰者角色)
 * @since: version 1.0
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(1f, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        // 计算价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        // 鸡蛋炒饭
        return super.getDesc() + getFastFood().getDesc();
    }
}
