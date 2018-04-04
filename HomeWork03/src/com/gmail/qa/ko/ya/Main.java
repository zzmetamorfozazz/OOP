package com.gmail.qa.ko.ya;

public class Main {

	public static void main(String[] args) {
		Group gr = new Group();
		Student st1 = new Student("St1", "St1", 18, true, "qa", "it");
		Student st2 = new Student("St2", "St2", 18, true, "qa", "it");
		Student st3 = new Student("St3", "St3", 18, true, "qa", "it");
		Student st4 = new Student("St4", "St4", 18, true, "qa", "it");
		Student st5 = new Student("St5", "St5", 18, false, "qa", "it");
		Student st6 = new Student("St6", "St6", 18, true, "qa", "it");
		Student st7 = new Student("St7", "St7", 18, true, "qa", "it");
		Student st8 = new Student("St8", "St8", 18, false, "qa", "it");
		Student st9 = new Student("St9", "St9", 18, true, "qa", "it");
		Student st10 = new Student("St10", "St10", 18, true, "qa", "it");
		Student st11 = new Student("St11", "St11", 18, true, "qa", "it");
		try{
			gr.addStudent(st1);
			gr.addStudent(st2);
			gr.addStudent(st3);
			gr.addStudent(st4);
			gr.addStudent(st5);
			gr.addStudent(st6);
			gr.addStudent(st7);
			gr.addStudent(st8);
			gr.addStudent(st9);
			gr.addStudent(st10);
			gr.delStudent(st4);
			gr.addStudent(st4);
			System.out.println(gr.serchStudent("St9"));
			gr.addStudent(st11);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
