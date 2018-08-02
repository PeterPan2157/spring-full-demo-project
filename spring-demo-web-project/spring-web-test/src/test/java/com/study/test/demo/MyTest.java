package com.study.test.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.test.bean.User;

public class MyTest {
	@Test
	public void fun1() {
	  //1.创建容器对象，相对于src下的路径
	  ApplicationContext ac=new ClassPathXmlApplicationContext("application-context.xml");
	  //2.向容器“要”user对象
	  User u=(User) ac.getBean("user");
	  //3.打印user对象
	  System.out.println(u);
	}
}
