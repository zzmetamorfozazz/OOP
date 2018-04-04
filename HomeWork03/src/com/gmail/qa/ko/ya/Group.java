package com.gmail.qa.ko.ya;

public class Group {
	private int nextIndex = 0;
	private Student[] students = new Student[10];

	public void addStudent(Student st) throws StudentException {
		students[nextIndex] = st;
	    ++nextIndex;	
	}

	public void delStudent(Student st) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == st) {
				students[i] = null;
				break;
			}
		}
	}

	public Student serchStudent(String lastName) {
		Student st = null;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getLastName().equals(lastName)) {
				st = students[i];
			}
		}
		return st;
	}

}