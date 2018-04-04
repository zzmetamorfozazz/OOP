package com.gmail.qa.ko.ya;

public class Square extends Shape {

	private double a;

	@Override
	public double getPerimetr() {
		return getA() * 4;
	}

	@Override
	public double getArea() {
		return getA() * getA();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

}