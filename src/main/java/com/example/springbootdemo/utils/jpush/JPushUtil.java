package com.example.springbootdemo.utils.jpush;

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

/**
 * 
    * @ClassName: JPushUtil
    * @Description: 极光推送 工具类
    * @author qinzz
    * @date 2016年10月18日 
    * @time 下午3:40:11
 */
public class JPushUtil {

	/**
	 * 
	    * @Title: SendPush_All
	    * @Description: 推给所有用户
	    * @param masterKey 极光推送master key
	    * @param appKey  极光推送app key
	    * @param content    推送内容
	    * void   返回类型
	    * @throws
	 */
	public static void SendPush_All(String masterKey, String appKey,String content) {
		JPushClient jpushClient = new JPushClient(masterKey, appKey);

		try {
			PushResult result = jpushClient.sendPush(PushPayload.alertAll(content));
			if (result != null) {
				System.out.println("result......" + result);
				System.out.println("推送成功！！！！！！");
			} else {
				System.out.println("result is null..........");
			}
		} catch (APIConnectionException e) {
			System.out.println("Connection error. Should retry later");
			e.printStackTrace();

		} catch (APIRequestException e) {
			System.out
					.println("Error response from JPush server. Should review and fix it.");
			e.printStackTrace();
		} finally {
			System.out.println("推送已经推出");
		}

	}
	
	/**
	 * 
	    * @Title: SendPush_To_One
	    * @Description: 推送给单个用户
	    * @param masterKey
	    * @param appKey
	    * @param registrationId  用户的reg_id
	    * @param content    推送内容
	    * void   返回类型
	    * @throws
	 */
	public static void SendPush_To_One(String masterKey, String appKey,String registrationId, String content){
		JPushClient jpushClient = new JPushClient(masterKey, appKey);
		try {
			PushPayload paylosd=PushPayload.newBuilder()
	                .setPlatform(Platform.all())//设置接受的平台
	                .setAudience(Audience.registrationId(registrationId))//推送给单个用户
	                .setNotification(Notification.alert(content))
	                .setOptions(Options.newBuilder()
                                .setApnsProduction(true)
                                .build())
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
	
	
	/**
	 * 
	    * @Title: SendPush_all_alias_alert
	    * @Description: 构建推送对象：所有平台，所有用户都可以接收到，通知内容为 content。
	    * @param masterKey
	    * @param appKey
	    * @param content    内容
	    * void   返回类型
	    * @throws
	 */
	public static void SendPush_all_alias_alert(String masterKey, String appKey,String content){
		JPushClient jpushClient = new JPushClient(masterKey, appKey);
		
		try {
			PushPayload paylosd=PushPayload.newBuilder()
	                .setPlatform(Platform.all())//设置接受的平台
	                .setAudience(Audience.all())//Audience设置为all，说明采用广播方式推送，所有用户都可以接收到
	                .setNotification(Notification.alert(content))
	                .setOptions(Options.newBuilder()
                                .setApnsProduction(true)
                                .build())
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

	
	/**
	 * 
	    * @Title: SendPush_To_android
	    * @Description: 构建推送对象：平台是 Android，通知 content，并且标题为 title。
	    * @param masterKey
	    * @param appKey
	    * @param title  标题（可为空）
	    * @param content    内容
	    * void   返回类型
	    * @throws
	 */
	public static void SendPush_To_android(String masterKey, String appKey,String title,String content){
		JPushClient jpushClient = new JPushClient(masterKey, appKey);
		
		try {
			PushPayload paylosd=PushPayload.newBuilder()
	                .setPlatform(Platform.android())//设置接受的android
	                .setAudience(Audience.all())
	                .setNotification(Notification.android(content, title, null))
	                .setOptions(Options.newBuilder()
                                .setApnsProduction(true)
                                .build())
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
	
	
	/**
	 * 
	    * @Title: SendPush_To_android_and_ios
	    * @Description: 推送给 android and ios
	    * @param masterKey
	    * @param appKey
	    * @param title
	    * @param content    参数
	    * void   返回类型
	    * @throws
	 */
	public static void SendPush_To_android_and_ios(String masterKey, String appKey,String title,String content){
		JPushClient jpushClient = new JPushClient(masterKey, appKey);
		
		try {
			PushPayload paylosd=PushPayload.newBuilder()
	                .setPlatform(Platform.android_ios())//设置接受的android and ios
	                .setAudience(Audience.tag("tag1"))
	                .setNotification(Notification.newBuilder()
	                .setAlert(content)
	                .addPlatformNotification(AndroidNotification.newBuilder()
	                .setTitle(title).build())
	                .addPlatformNotification(IosNotification.newBuilder()
	                .incrBadge(1)
	                .addExtra("from", "JPush").build())
	                .build())
	                .setOptions(Options.newBuilder()
                                .setApnsProduction(true)
                                .build())
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
