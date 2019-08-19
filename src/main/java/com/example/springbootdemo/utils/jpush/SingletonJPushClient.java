package com.example.springbootdemo.utils.jpush;

import cn.jpush.api.JPushClient;

/**
 * 
 * @ClassName: SingletonJPushClient：单例模式：极光推送创建推送请求客户端
 * @Description: 极光推送创建推送请求客户端单例模式（线程安全 并且效率高 ）
 * 
 * @author qinzz
 * @date 2017年3月16日
 * @time 上午10:44:23
 */
public class SingletonJPushClient {
	// 定义一个私有构造方法
	private SingletonJPushClient() {
	}

	/**
	 * 定义一个静态私有变量(不初始化，不使用final关键字，使用volatile保证了多线程访问时jpushClient变量的可见性，
	 * 避免了jpushClient初始化时其他变量属性还没赋值完时，被另外线程调用)
	 */
	private static volatile JPushClient jpushClient;

	// 定义一个共有的静态方法，返回该类型实例
	public static JPushClient getJpushClient() {
		// 对象实例化时与否判断（不使用同步代码块，jpushClient不等于null时，直接返回对象，提高运行效率）
		if (jpushClient == null) {
			// 同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
			synchronized (SingletonJPushClient.class) {
				// 未初始化，则初始jpushClient变量
				if (jpushClient == null) {
					jpushClient = new JPushClient(
							JPushConstantUtil.MASTER_SECRET_BUSINESS,
							JPushConstantUtil.APP_KEY_BUSINESS);
				}
			}
		}
		return jpushClient;
	}
}
