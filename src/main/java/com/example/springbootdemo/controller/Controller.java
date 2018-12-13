package com.example.springbootdemo.controller;

import com.example.springbootdemo.domain.ConfigBean;
import com.example.springbootdemo.domain.ConfigBeanTest;
import com.example.springbootdemo.domain.Girl;
import com.example.springbootdemo.service.GirlService;
import jdk.internal.org.objectweb.asm.ClassWriter;
import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Controller {

  @Autowired
  private GirlService girlService;

  /*@Value("${com.dudu.name}")
  private String name;

  @Value("${com.dudu.want}")
  private String want;*/

  //@Autowired
  //ConfigBean configBean;

  @Autowired
  ConfigBeanTest configBeanTest;

  /**
   * 添加
   *
   * @param girl
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/test/add")
  public Girl save(@ModelAttribute("girl")Girl girl)throws Exception{

    // 获得Class对象的方式一
    Class c = ConfigBean.class;
    // 获得Class对象的方式二
    ConfigBean configBean = new ConfigBean();
    Class c1 = configBean.getClass();
    // 获得Class对象的方式三
    Class aClass = Class.forName("D:\\myRepostory\\springbootdemo\\src\\main\\java\\com\\example\\springbootdemo\\domain\\ConfigBean.java");


    //girl.setAddress(configBean.getWant());
    //girl.setUser_name(configBean.getName());
    //girl.setSex(configBean.getDouble1());
    System.out.println(configBeanTest.getDouble1());
    girl.setAddress(configBeanTest.getWant());
    girl.setUser_name(configBeanTest.getName());
    girl.setSex(configBeanTest.getDouble1());
    girlService.save(girl);
    return girl;
  }

  /**
   * 删除
   *
   * @param girl
   * @throws Exception
   */
  @RequestMapping(value = "/test/delete")
  public void delete(@ModelAttribute("girl")Girl girl)throws Exception{
    girlService.delete(girl);
  }

  /**
   * 查询全部数据
   *
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "test/findAll")
  public List<Girl> findAll()throws Exception{
    return girlService.findAll();
  }

  @RequestMapping(value = "test/order")
  public List<Girl> findAllOrder()throws Exception{

    Sort sort = new Sort(Sort.Direction.ASC,"id");
    return girlService.findAllOrder(sort);

  }

}