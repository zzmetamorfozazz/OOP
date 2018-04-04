package com.gmail.qa.ko.ya;

public class Rectangle extends Shape {
	private double a;
	private double b;

	@Override
	public double getPerimetr() {
		return 2 * (getA() + getB());
	}

	@Override
	public double getArea() {
		return getA() * getB();
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

}
