package com.example.designPattern.adapter.class_adapter;

/**
 * @author: zhoupb
 * @Description: 适配者类
 * @since: version 1.0
 */
public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg : " + msg);
    }
}
