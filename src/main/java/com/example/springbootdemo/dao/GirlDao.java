package com.example.springbootdemo.dao;

import com.example.springbootdemo.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GirlDao extends JpaRepository<Girl, Integer>{
}
