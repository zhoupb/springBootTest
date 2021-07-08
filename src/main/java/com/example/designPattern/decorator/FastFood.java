package com.example.designPattern.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: zhoupb
 * @Description: 快餐类(抽象构件角色)
 * @since: version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class FastFood {

    private Float price;

    private String desc;

    public abstract float cost();
}
