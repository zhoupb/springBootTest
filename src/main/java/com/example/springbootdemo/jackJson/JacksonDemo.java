package com.example.springbootdemo.jackJson;

import com.example.springbootdemo.domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JacksonDemo {

    public static void main(String[] args) throws Exception{

        // 序列化
       /* User user = new User();
        user.setAge(20);
        user.setEmail("xiaomin@sina.com");
        user.setName("小民");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        user.setBirthday(simpleDateFormat.parse("1996-01-01 "));

        ObjectMapper objectMapper = new ObjectMapper();

        //User类转JSON
        //输出结果：{"name":"小民","age":20,"birthday":844099200000,"email":"xiaomin@sina.com"}
        String json = objectMapper.writeValueAsString(user);
        System.out.println(json+".............");

        //Java集合转JSON
        //输出结果：[{"name":"小民","age":20,"birthday":844099200000,"email":"xiaomin@sina.com"}]
        List<User> users = new ArrayList<>();
        users.add(user);
        String json1 = objectMapper.writeValueAsString(users);
        System.out.println(json1+"////////////////");*/


       // 反序列化
        String json = "{\"name\":\"小民\",\"age\":20,\"birthday\":844099200000,\"email\":\"xiaomin@sina.com\"}";

        /**
         * ObjectMapper支持从byte[]、File、InputStream、字符串等数据的JSON反序列化。
         */
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(json, User.class);
        System.out.println(user);

    }
}
