package com.gmail.qa.ko.ya;

public class Square extends Shape {

	public double a;

	@Override
	public double getPerimetr() {
		return a*4;
	}

	@Override
	public double getArea() {
		return a*a;
	}

}
