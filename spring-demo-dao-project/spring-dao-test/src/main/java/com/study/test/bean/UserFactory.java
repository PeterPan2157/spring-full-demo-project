package com.study.test.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;

@Repository
public class UserFactory {
	public static User createUser1() {
		System.out.println("静态工厂创建User");// 表示由用户自己创建
		return new User();
	}

	public User createUser2() {// 不是静态方法
		System.out.println("实例工厂创建User");
		return new User();
	}

	@Override
	public String toString() {
		return "UserFactory []";
	}
	
	// 下面的这两个注释，只有当前类是由spring创建的时候才会主动生效
	@PostConstruct // 在对象被创建之后调用，init-method
	public void init() {
		System.out.println("初始化");
	}

	@PreDestroy // 在对象销毁之前调用，destroy-method
	public void destroy() {
		System.out.println("销毁");
	}

}
