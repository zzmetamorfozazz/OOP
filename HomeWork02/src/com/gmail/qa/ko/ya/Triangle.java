package com.gmail.qa.ko.ya;

public class Triangle extends Shape {

	public double a;
	public double b;
	public double c;
	@Override
	public double getPerimetr() {		
		return a+b+c;
	}

	@Override
	public double getArea() {
		double polP = (a+b+c)/2;
		return Math.sqrt(polP*(polP-a)*(polP-b)*(polP-c));
	}

}
