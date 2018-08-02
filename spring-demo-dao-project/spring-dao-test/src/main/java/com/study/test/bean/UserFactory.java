package com.study.test.bean;

public class UserFactory {
	public static User createUser1() {
		System.out.println("静态工厂创建User");// 表示由用户自己创建
		return new User();
	}

	public User createUser2() {// 不是静态方法
		System.out.println("实例工厂创建User");
		return new User();
	}
}
