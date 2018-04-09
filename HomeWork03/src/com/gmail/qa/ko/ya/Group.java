package com.gmail.qa.ko.ya;

import java.util.Arrays;

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
	
	public void sortByLastName(){
		for (int i = 0; i < students.length; i++) {
	        Student min = students[i];
	        int min_i = i; 
	        for (int j = i+1; j < students.length; j++) {
	            if (students[j].getLastName().compareTo(min.getLastName()) < 0) {
	                min = students[j];
	                min_i = j;
	            }
	        }
	        if (i != min_i) {
	            Student tmp = students[i];
	            students[i] = students[min_i];
	            students[min_i] = tmp;
	        }
	     }
	}
	
	public void sortByParametr(int i) {
		Arrays.sort(students, new CompareStudents(i));
	}
	
	public Student[] getAllStudent(){
		return students;
	}

}
