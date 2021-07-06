package com.example.designPattern.adapter.class_adapter;

/**
 * @author: zhoupb
 * @Description: 目标接口
 * @since: version 1.0
 */
public interface SDCard {

    /**
     * 从SD中读取数据
     */
    String readSD();

    /**
     * 向SD卡中写数据
     */
    void writeSD(String msg);
}
