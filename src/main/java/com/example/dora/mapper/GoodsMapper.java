package com.example.dora.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dora.domain.Goods;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: zhoupb
 * @Description: GoodsMapper
 * @since: version 1.0
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
}
