package com.example.designPattern.adapter.object_adapter;

/**
 * @author: zhoupb
 * @Description: SDAdaoterTF
 * @since: version 1.0
 */
public class SDAdaoterTF extends TFCardImpl implements SDCard {

    // 声明适配者类
    private TFCard tfCard;

    // 有参构造
    public SDAdaoterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

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
