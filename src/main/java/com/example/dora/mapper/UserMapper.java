package com.example.dora.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dora.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: zhoupb
 * @Description: UserMapper
 * @since: version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
