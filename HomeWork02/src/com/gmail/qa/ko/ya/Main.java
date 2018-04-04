package com.gmail.qa.ko.ya;

public class Main {

	public static void main(String[] args) {
		System.out.println("Triangle:");

		Triangle tr = new Triangle();
		tr.setA(9);
		tr.setB(4);
		tr.setC(9);
		Shape sp = tr;
		System.out.println(sp.getArea());
		System.out.println(sp.getPerimetr());
		System.out.println("Square:");

		Square sq = new Square();
		sq.setA(8);
		sp = sq;
		System.out.println(sp.getArea());
		System.out.println(sp.getPerimetr());
		System.out.println("Rectangle:");

		Rectangle rc = new Rectangle();
		rc.setA(3);
		rc.setB(4);
		sp = rc;
		System.out.println(sp.getArea());
		System.out.println(sp.getPerimetr());
	}

}