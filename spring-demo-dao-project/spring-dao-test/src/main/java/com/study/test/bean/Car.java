package com.study.test.bean;

public class Car {
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