package com.study.test.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User {
	private Integer id;
	private String name;
	private Integer age;
	private Car car;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
	@PostConstruct // 在对象被创建之后调用，init-method
	public void init() {
		System.out.println("初始化");
	}

	@PreDestroy // 在对象销毁之前调用，destroy-method
	public void destroy() {
		System.out.println("销毁");
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
}
