package com.example.dora.service.impl;

import com.example.dora.config.datasource.DataSource;
import com.example.dora.domain.User;
import com.example.dora.mapper.UserMapper;
import com.example.dora.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zhoupb
 * @Description: UserServiceImpl
 * @since: version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    //@DataSource("zpb")
    public void add(User user) {
        userMapper.insert(user);
    }
}
