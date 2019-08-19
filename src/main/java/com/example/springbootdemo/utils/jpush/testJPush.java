
package com.example.springbootdemo.utils.jpush;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.common.resp.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.PushPayload;


public class testJPush {

	public static void main(String[] args) {
		testSend();
	}
	
	private static void testSend(){
		JPushClient jpushClient = new JPushClient(JPushConstantUtil.MASTER_SECRET_BUSINESS, JPushConstantUtil.APP_KEY_BUSINESS);
		//生成推送的内容给单个用户
        PushPayload payload=JPushClientUtil.sendPush_To_One("190e35f7e04d7888c1a", "你好,朵拉祝你国庆节快乐！");
        try {
        	System.out.println("payload........"+payload.toString());
            PushResult result = jpushClient.sendPush(payload);
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
        }finally{	        	
        	System.out.println("推送已经推出");
        }
	}
}
