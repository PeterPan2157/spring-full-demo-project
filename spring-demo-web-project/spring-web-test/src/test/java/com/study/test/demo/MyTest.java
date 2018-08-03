package com.study.test.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.test.bean.Car;
import com.study.test.bean.CollectionBean;
import com.study.test.bean.User;
import com.study.test.bean.UserFactory;

public class MyTest {
	@Test
	public void fun1() {
		// 1.创建容器对象，相对于src下的路径
		ApplicationContext ac = new ClassPathXmlApplicationContext("application-context-2.xml");
		// 2.向容器“要”user对象
		// User user1 = (User) ac.getBean("user1");
		// User user2 = (User) ac.getBean("user2");
		// User user3 = (User) ac.getBean("user3");
		// User user6 = (User) ac.getBean("user6");
		// User user7 = (User) ac.getBean("user7");
		// User user8 = (User) ac.getBean("user8");
		User user9 = (User) ac.getBean("user");
		Car car = (Car) ac.getBean("car");
		UserFactory userFactory = (UserFactory) ac.getBean("userFactory");
		CollectionBean collectionBean = (CollectionBean) ac.getBean("collectionBean");
		// 3.打印user对象
		// System.out.println("user1 = " + user1);
		// System.out.println("user2 = " + user2);
		// System.out.println("user3 = " + user3);
		// System.out.println("user6 = " + user6);
		// System.out.println("user7 = " + user7);
		// System.out.println("user8 = " + user8);
		System.out.println("user9 = " + user9);
		System.out.println("car = " + car);
		System.out.println("userFactory = " + userFactory);
		System.out.println("collectionBean = " + collectionBean);
	}
}
