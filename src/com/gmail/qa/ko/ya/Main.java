package com.gmail.qa.ko.ya;

public class Main {

	public static void main(String[] args) {
		// task with Cat
		Cat catOne = new Cat("Shedy", "Gray", 5, 3);
		Cat catTwo = new Cat();
		catTwo.setName("Shila");
		catTwo.setColor("Colorful");
		catTwo.setAge(6);
		catTwo.setWeight(4);
		System.out.println(catOne);
		System.out.println(catTwo);

		// task with triangle
		Triangle trOne = new Triangle(4, 5, 3);
		Triangle trTwo = new Triangle();
		trTwo.setA(6);
		trTwo.setB(7);
		trTwo.setC(3);
		
		System.out.println(trOne.getSquare());
		System.out.println(trTwo.getSquare());
	}

}
