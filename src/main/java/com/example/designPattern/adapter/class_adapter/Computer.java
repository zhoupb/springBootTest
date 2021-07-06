package com.example.designPattern.adapter.class_adapter;

import java.util.Objects;

/**
 * @author: zhoupb
 * @Description: 计算机类
 * @since: version 1.0
 */
public class Computer {


    /**'
     * 从SD卡中读取数据
     */
    public String readSD(SDCard sdCard){
        if (Objects.isNull(sdCard)){
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
