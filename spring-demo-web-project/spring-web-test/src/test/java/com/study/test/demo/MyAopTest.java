package com.study.test.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.test.interfaces.UserInterface;

//创建容器
@RunWith(SpringJUnit4ClassRunner.class)
//指定容器使用配置文件
@ContextConfiguration("classpath:application-context-2.xml")
public class MyAopTest {

  //将名为user的对象注入u变量中
  @Resource
  private UserInterface userInterfaceImpl;

  @Test
  public void fun1() {

      System.out.println(userInterfaceImpl);
      userInterfaceImpl.save();
  }
}