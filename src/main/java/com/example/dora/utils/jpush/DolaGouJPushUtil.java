package com.example.dora.utils.jpush;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.common.resp.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;

import java.util.Map;

public class DolaGouJPushUtil {			
	/**
	 * 
	    * @Title: SendPush_To_One
	    * @Description: 朵拉购推送给单个用户
	    * @param masterKey
	    * @param appKey
	    * @param registrationId  用户的reg_id
	    * @param content  推送内容
	    * @param title   推送的标题
	    * @param alert   显示的内容
	    * void   返回类型
	    * @throws
	 */
	public static void SendPush_To_One(String registrationId,String alert, String title,Map map){
//		JPushClient jpushClient = new JPushClient(JPushConstantUtil.MASTER_SECRET_BUSINESS,
//				JPushConstantUtil.APP_KEY_BUSINESS);
		//使用单例模式创建极光推送客户端
		JPushClient jpushClient=SingletonJPushClient.getJpushClient();
		try {
			PushPayload paylosd=PushPayload.newBuilder()
	                .setPlatform(Platform.android_ios())//设置接受的平台
	                .setAudience(Audience.registrationId(registrationId))//推送给单个用户
	                .setNotification(Notification.newBuilder()
                		.setAlert(alert)
                		.addPlatformNotification(AndroidNotification.newBuilder()
                		.setTitle(title)//推送给安卓端的标题                		
                		.addExtras(map).build())
                		.addPlatformNotification(IosNotification.newBuilder()
                		.incrBadge(1)
                		.setBadge(0)
                		.addExtras(map).build())
                		.build())
                		.setOptions(Options.newBuilder()
                                .setApnsProduction(true)
                                .build())
	                .build();//ApnsProduction：true:正式环境，false:测试环境
			 PushResult result = jpushClient.sendPush(paylosd);
			 if(result!=null){
           	  System.out.println("result......"+result);
           	  System.out.println("推送成功！！！！！！");
           }
           else{
           	System.out.println("result is null..........");
           }
			
		} catch (APIConnectionException e) {
			System.out.println("Connection error. Should retry later");
			e.printStackTrace();

		} catch (APIRequestException e) {
			System.out.println("Error response from JPush server. Should review and fix it.");
			e.printStackTrace();
		} finally {
			System.out.println("推送已经推出");
		}
		
	}
	
	public static void SendPush_To_Ios(String registrationId,String alert, Map map){
//		JPushClient jpushClient = new JPushClient(masterKey, appKey);
		//使用单例模式创建极光推送客户端
				JPushClient jpushClient=SingletonJPushClient.getJpushClient();
		try {
			PushPayload paylosd=PushPayload.newBuilder()
	                .setPlatform(Platform.ios())//设置接受的平台
	                .setAudience(Audience.registrationId(registrationId))//推送给单个用户
	                .setNotification(Notification.ios(alert, map))
	                
	                .build();
			 PushResult result = jpushClient.sendPush(paylosd);
			 if(result!=null){
           	  System.out.println("result......"+result);
           	  System.out.println("推送成功！！！！！！");
           }
           else{
           	System.out.println("result is null..........");
           }
			
		} catch (APIConnectionException e) {
			System.out.println("Connection error. Should retry later");
			e.printStackTrace();

		} catch (APIRequestException e) {
			System.out.println("Error response from JPush server. Should review and fix it.");
			e.printStackTrace();
		} finally {
			System.out.println("推送已经推出");
		}
		
	}
	
	
	public static void SendPush_To_Android(String registrationId,String title, String content,Map map){
//		JPushClient jpushClient = new JPushClient(masterKey, appKey);
		//使用单例模式创建极光推送客户端
		JPushClient jpushClient=SingletonJPushClient.getJpushClient();
		try {
			PushPayload paylosd=PushPayload.newBuilder()
	                .setPlatform(Platform.android())//设置接受的平台
	                .setAudience(Audience.registrationId(registrationId))//推送给单个用户
	                 .setNotification(Notification.android(content, title, map))
	                .build();
			 PushResult result = jpushClient.sendPush(paylosd);
			 if(result!=null){
           	  System.out.println("result......"+result);
           	  System.out.println("推送成功！！！！！！");
           }
           else{
           	System.out.println("result is null..........");
           }
			
		} catch (APIConnectionException e) {
			System.out.println("Connection error. Should retry later");
			e.printStackTrace();

		} catch (APIRequestException e) {
			System.out.println("Error response from JPush server. Should review and fix it.");
			e.printStackTrace();
		} finally {
			System.out.println("推送已经推出");
		}
		
	}
}
