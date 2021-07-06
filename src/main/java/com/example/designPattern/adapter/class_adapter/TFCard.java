package com.example.designPattern.adapter.class_adapter;

/**
 * @author: zhoupb
 * @Description: 适配者类的接口
 * @since: version 1.0
 */
public interface TFCard {

    /**
     * 从TF中读取数据
     */
    String readTF();

    /**
     * 向TF卡中写数据
     */
    void writeTF(String msg);
}
