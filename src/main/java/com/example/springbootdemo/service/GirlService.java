package com.example.springbootdemo.service;

import com.example.springbootdemo.domain.Girl;
import org.springframework.data.domain.Sort;
import java.util.List;

public interface GirlService {

    // 添加
    Girl save(Girl girl);

    // 删除
    void delete(Girl girl);

    // 查询全部数据
    List<Girl> findAll();

    // Springboot 之 使用JPA对数据进行排序
    List<Girl> findAllOrder(Sort sort);




}
