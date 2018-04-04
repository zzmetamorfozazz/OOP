package com.gmail.qa.ko.ya;

public class Student extends Human {

	private String specialty;
	private String faculty;

	Student(String name, String lastName, int age, boolean sex, String specialty, String faculty) {
		super(name, lastName, age, sex);
		this.specialty = specialty;
		this.faculty = faculty;

	}

	public Student() {

	}

	@Override
	public String toString() {
		return getName() + " " + getLastName() + " ," + sexStudent(isSex()) + " ," + getAge() + "year," + "raiting"
				+ specialty + "faculty" + faculty;

	}

	private String sexStudent(boolean sex) {
		if (this.isSex()) {
			return "Male";
		} else
			return "Famale";
	}

}
