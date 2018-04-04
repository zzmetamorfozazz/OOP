package com.gmail.qa.ko.ya;

public class Triangle extends Shape {

	private double a;
	private double b;
	private double c;

	@Override
	public double getPerimetr() {
		return getA() + getB() + getC();
	}

	@Override
	public double getArea() {
		double polP = (getA() + getB() + getC()) / 2;
		return Math.sqrt(polP * (polP - getA()) * (polP - getB()) * (polP - getC()));
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
