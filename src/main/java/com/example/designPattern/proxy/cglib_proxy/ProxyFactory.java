package com.example.designPattern.proxy.cglib_proxy;

import com.example.designPattern.proxy.jdk_proxy.TrainStation;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: zhoupb
 * @Description: 获取代理对象的工厂类（它不是代理类对象，代理类对象是在程序运行中动态生成的，我们是看不到的）
 * @since: version 1.0
 */
public class ProxyFactory implements MethodInterceptor {

    /**
     * 声明目标对象
     */
    private TrainStation station = new TrainStation();

    /**
     * 获取代理对象的方法
     */
    public TrainStation getProxyObject() {

        // 创建enhancer对象，类似JDK代理中的proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象，指定父类
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("intercept方法执行了");

        System.out.println("代售点收取一定的服务费用(CGLib动态代理)");
        // 要调用目标对象的方法
        Object obj = method.invoke(station, objects);
        return obj;
    }
}
