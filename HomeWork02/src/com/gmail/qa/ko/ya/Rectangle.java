package com.gmail.qa.ko.ya;

public class Rectangle extends Shape {
	public double a;
	public double b;

	@Override
	public double getPerimetr() {
		return 2*(a+b);
	}

	@Override
	public double getArea() {
		return a*b;
	}

}
