
package com.example.springbootdemo.utils.jpush;

import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;


/**
 * 
    * @ClassName: JPushClientUtil
    * @Description: 极光推送 工具类（暂时不用）
    * @author qinzz
    * @date 2016年9月23日 
    * @time 下午2:53:51
 */
public class JPushClientUtil {
    
		/**
		 * 
		    * @Title: sendPush_All
		    * @Description: 推给所有用户
		    * @param content 推送内容
		    * @return    参数
		    * PushPayload   返回类型
		    * @throws
		 */
	   public static PushPayload sendPush_All(String content) {	
		   return PushPayload.alertAll(content);
	    }
	   
	   
	   /**
	    * 
	       * @Title: sendPush_to_One
	       * @Description: 构建推送对象：所有平台，reg_id: registrationId，通知内容为 ALERT。
	       * 	registrationId 推送给单个用户的reg_id
	       * @return    参数
	       * PushPayload   返回类型
	       * @throws
	    */
	   public static PushPayload sendPush_To_One(String registrationId, String content) {
	        return   PushPayload.newBuilder()
	                .setPlatform(Platform.all())//设置接受的平台
	                .setAudience(Audience.registrationId(registrationId))//推送给单个用户
	                .setNotification(Notification.alert(content))
	                .build();
	    }
	   
	   
	   /**
	    * 
	       * @Title: sendPush_all_alias_alert
	       * @Description: 构建推送对象：所有平台，所有用户都可以接收到，通知内容为 ALERT。
	       * @param content 推送内容
	       * @return    参数
	       * PushPayload   返回类型
	       * @throws
	    */
	   public static PushPayload sendPush_all_alias_alert(String content) {
	        return   PushPayload.newBuilder()
	                .setPlatform(Platform.all())//设置接受的平台
	                .setAudience(Audience.all())//Audience设置为all，说明采用广播方式推送，所有用户都可以接收到
	                .setNotification(Notification.alert(content))
	                .build();
	    }
	   
	   /**
	    * 
	       * @Title: sendPush_To_ANDROID
	       * @Description: 构建推送对象：平台是 Android，通知 content，并且标题为 title。
	       * @param content 推送内容
	       * @param title 推送标题
	       * @return    参数
	       * PushPayload   返回类型
	       * @throws
	    */
	   public static PushPayload sendPush_To_android(String title,String content) {
	        return PushPayload.newBuilder()
	                .setPlatform(Platform.android())//设置接受的android
	                .setAudience(Audience.all())
	                .setNotification(Notification.android(content, title, null))
	                .build();
	    }
	   
	   /**
	    * 
	       * @Title: sendPush_To_android_and_ios
	       * @Description: TODO(这里用一句话描述这个方法的作用)
	       * @return    参数
	       * @param content 推送内容
	       * @param title 推送标题
	       * PushPayload   返回类型
	       * 附加字段 from = "JPush"
	       * @throws
	    */
	   public static PushPayload sendPush_To_android_and_ios(String title,String content) {
	        return PushPayload.newBuilder()
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
	                .build();
	    }
}
