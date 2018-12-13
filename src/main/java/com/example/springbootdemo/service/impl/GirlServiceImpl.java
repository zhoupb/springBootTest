package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dao.GirlDao;
import com.example.springbootdemo.domain.Girl;
import com.example.springbootdemo.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class GirlServiceImpl implements GirlService{

    @Autowired
    private GirlDao girlDao;


    @Override
    public Girl save(Girl girl) {
        return girlDao.save(girl);

    }

    @Override
    public void delete(Girl girl) {

        girlDao.delete(girl);
    }

    @Override
    public List<Girl> findAll() {
        return girlDao.findAll();
    }

    @Override
    public List<Girl> findAllOrder(Sort sort) {
        return girlDao.findAll();
    }
}
