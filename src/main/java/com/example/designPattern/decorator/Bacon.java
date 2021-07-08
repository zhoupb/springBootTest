package com.example.designPattern.decorator;

/**
 * @author: zhoupb
 * @Description: 培根类(具体的装饰者角色)
 * @since: version 1.0
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(2f, "培根", fastFood);
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
