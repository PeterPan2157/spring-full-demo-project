package com.study.test.bean;

import org.springframework.beans.factory.annotation.Value;

public class Car {
	@Value("法拉利")
	private String name;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + "]";
	}

}
