package com.example.designPattern.prototype.deep_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author: zhoupb
 * @Description: 奖状原型类： 深克隆 测试类
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) throws Exception {

        Citation citation = new Citation();
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

        // 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/a.txt"));
        // 写对象
        oos.writeObject(citation);
        // 释放资源
        oos.close();

        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/a.txt"));
        // 读对象
        Citation citation1 = (Citation) ois.readObject();
        // 释放资源
        ois.close();
        // 修改克隆对象的属性
        citation1.getStu().setName("李四");

        citation.show();
        citation1.show();

    }
}
