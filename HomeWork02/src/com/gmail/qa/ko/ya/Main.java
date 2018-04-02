package com.gmail.qa.ko.ya;

public class Main {

	public static void main(String[] args) {
		System.out.println("Triangle:");
		Triangle tr = new Triangle();
		tr.a = 9;
		tr.b = 4;
		tr.c = 9;
		Shape sp = tr;
		System.out.println(sp.getArea());
		System.out.println(sp.getPerimetr());
		System.out.println("Square:");
		Square sq = new Square();
		sq.a = 8;
		sp = sq;
		System.out.println(sp.getArea());
		System.out.println(sp.getPerimetr());
		System.out.println("Rectangle:");
		Rectangle rc = new Rectangle();
		rc.a =3;
		rc.b = 4;
		sp = rc;
		System.out.println(sp.getArea());
		System.out.println(sp.getPerimetr());
	}

}
