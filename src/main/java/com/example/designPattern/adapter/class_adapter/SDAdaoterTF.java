package com.example.designPattern.adapter.class_adapter;

/**
 * @author: zhoupb
 * @Description: SDAdaoterTF
 * @since: version 1.0
 */
public class SDAdaoterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("adapter read TF card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write TF card");
        writeTF(msg);
    }
}
