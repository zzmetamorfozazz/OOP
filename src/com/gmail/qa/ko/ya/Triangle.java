package com.gmail.qa.ko.ya;

public class Triangle {
	private double a;
	private double b;
	private double c;

	public Triangle() {

	}

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
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

	public double getSquare() {
		double p = (a + b + c) / 2;
		double x = p * ((p - a) * (p - b) * (p - c));
		return Math.sqrt(x);
	}
}
