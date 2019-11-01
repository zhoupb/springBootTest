package com.example.dora.service.impl;

import com.example.dora.domain.Goods;
import com.example.dora.mapper.GoodsMapper;
import com.example.dora.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: zhoupb
 * @Description: GoodsServiceImpl
 * @since: version 1.0
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    @Transactional
    public void add(Goods goods) {
        goodsMapper.insert(goods);
    }
}
