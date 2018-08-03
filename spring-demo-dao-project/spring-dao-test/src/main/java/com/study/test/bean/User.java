package com.study.test.bean;

import org.springframework.stereotype.Repository;

@Repository("user")
public class User {
	private String name;
	private Integer age;
	private Car car;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public User() {
		super();
		System.out.println("构造方法创建User---空构造方法");
	}

	public User(String name, Integer age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
		System.out.println("构造方法创建User---带参构造方法");
	}

	// 并在User中实现此方法
	public void init() {
		System.out.println("初始化");
	}

	public void destroy() {
		System.out.println("销毁");
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
}
