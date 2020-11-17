package com.example.dora.service.impl;

import com.example.dora.config.datasource.DataSource;
import com.example.dora.config.datasource.DataSourceName;
import com.example.dora.domain.User;
import com.example.dora.domain.syjdomain.SuUser;
import com.example.dora.mapper.UserMapper;
import com.example.dora.mapper.syjmapper.SuUserMapper;
import com.example.dora.service.UserService;
import com.example.dora.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: zhoupb
 * @Description: UserServiceImpl
 * @since: version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SuUserMapper suUserMapper;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    @DataSource("db_dora_syj")
    public void addSyj(User user) {


    }
}
