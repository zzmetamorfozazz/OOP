package com.gmail.qa.ko.ya;

import java.util.Comparator;

public class CompareStudents  implements Comparator<Student>  {

	private int i;
	
	public CompareStudents(int i) {
		this.i = i;
	}
	@Override
	public int compare(Student o1, Student o2) {
		if (o1 != null && o2 == null) {
			return 1;
		}
		if (o1 == null && o2 != null) {
			return -1;
		}
		if (o1 == null && o2 == null) {
			return 0;
		}
		switch (this.i) {
		case 0:
			return (o1.getName().compareTo(o2.getName()));
		case 1:
			return (o1.getLastName().compareTo(o2.getLastName()));
		case 2:
			return (o1.getAge() - o2.getAge());
		case 3:
			return ((o1.isSex()) ? 1 : -1);
		}
		return 0;
	}
}
