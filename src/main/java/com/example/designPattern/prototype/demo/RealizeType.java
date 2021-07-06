package com.example.designPattern.prototype.demo;

/**
 * @author: zhoupb
 * @Description: 原型类
 * @since: version 1.0
 */
public class RealizeType implements Cloneable{

    public RealizeType() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    protected RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (RealizeType) super.clone();
    }
}
