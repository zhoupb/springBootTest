package com.example.designPattern.adapter.object_adapter;

/**
 * @author: zhoupb
 * @Description: 具体的SD卡
 * @since: version 1.0
 */
public class SDCardImpl implements SDCard {

    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello SDCard";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
