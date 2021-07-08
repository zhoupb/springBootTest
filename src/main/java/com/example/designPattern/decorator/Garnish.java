package com.example.designPattern.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: zhoupb
 * @Description: 装饰者类(抽象装饰者抽象角色)
 * @since: version 1.0
 */
@Data
public abstract class Garnish extends FastFood {

    /**
     * 定义定义快餐类对象
     */
    private FastFood fastFood;

    public Garnish(Float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
