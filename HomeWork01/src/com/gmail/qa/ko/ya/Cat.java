package com.gmail.qa.ko.ya;

public class Cat {
	private String name;
	private String voice = "Meow";
	private String color;
	private double age;
	private double weight;

	public Cat() {
	}

	public Cat(String name, String color, int age, double weight) {
		this.name = name;
		this.color = color;
		this.age = age;
		this.weight = weight;
	}

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

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "name-'" + name + "'," + "color-'" + color + "'," + "age-'" + age + "'," + "voice-'" + voice + "',"
				+ "weight-'" + weight + "'";
	}
}
