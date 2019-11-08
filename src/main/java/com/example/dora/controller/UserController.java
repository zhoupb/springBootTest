package com.example.dora.controller;


import com.example.dora.domain.User;
import com.example.dora.service.UserService;
import com.example.dora.utils.RedisUtil;
import com.example.dora.utils.SendEmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private SendEmailUtil emailUtil;

    @Value("${spring.mail.receives}")
    private String receives;

    @RequestMapping(value = "one", method = RequestMethod.POST)
    public void add(User user) {

        try {
            userService.add(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}