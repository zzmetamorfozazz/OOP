package com.gmail.qa.ko.ya;

import java.util.Arrays;

public class ClassMilitary implements Military {
	@Override
	public Student[] searchConscripts(Student[] st) {
		Student[] tempArray = new Student[st.length];
		int j = 0;
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null && st[i].isSex()== true && st[i].getAge() >=18) {
				tempArray[j++] = st[i];
			}
		}
		Student[] outArray = Arrays.copyOf(tempArray, j);
		return outArray;
	}
}
