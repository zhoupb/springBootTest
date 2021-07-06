package com.example.designPattern.factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author: zhoupb
 * @Description: CoffeeFactory
 * @since: version 1.0
 */
public class CoffeeFactory {

    // 1：定义容器存
    private static HashMap<String, Coffee> map = new HashMap<>();

    // 2：加载配置文件将咖啡对象存储到容器中，只加载一次
    static {
        // 2.1：创建Properties对象
        Properties p = new Properties();
        // 2.2：调用p对象中的load方法，进行配置文件的加载
        InputStream inputStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {

            p.load(inputStream);
            // 在p对象中获取全类名并创建对象
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                // 通过反射创建对象
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                // 将对象存储到容器中
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 根据名称获取对象
    public static Coffee createCoffee(String coffeeName) {
        Coffee coffee = map.get(coffeeName);
        return coffee;
    }
}
