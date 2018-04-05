package com.gmail.qa.ko.ya;

public class Group {
	private Student[] students = new Student[10];

	public void addStudent(Student st) throws StudentException {
		boolean search = true;
		try{
			for(int i = 0;search;i++){
				if(students[i] == null){
					students[i] = st;
					search = false;
				}
			}
		}catch(Exception e){
			throw new StudentException();
		}
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
