package com.example.dora.service;

import com.example.dora.config.datasource.DataSource;
import com.example.dora.domain.User;

/**
 * @author: zhoupb
 * @Description: UserService
 * @since: version 1.0
 */
public interface UserService {

    void add(User user);

    void addSyj(User user);
}
