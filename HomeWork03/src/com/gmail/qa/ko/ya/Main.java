package com.gmail.qa.ko.ya;

public class Main {

	public static void main(String[] args) {
		ClassMilitary voencom = new ClassMilitary();
		Group gr = new Group();
		Student st1 = new Student("St1", "Kondr", 18, true, "qa", "it");
		Student st2 = new Student("St3", "Bondr", 17, true, "qa", "it");
		Student st3 = new Student("St2", "Vondr", 18, true, "qa", "it");
		Student st4 = new Student("St7", "Condr", 18, true, "qa", "it");
		Student st5 = new Student("St5", "Pondr", 15, false, "qa", "it");
		Student st6 = new Student("St6", "Aondr", 18, true, "qa", "it");
		Student st7 = new Student("St4", "Aandr", 16, true, "qa", "it");
		Student st8 = new Student("St8", "Abndr", 18, false, "qa", "it");
		Student st9 = new Student("St9", "Wondr", 16, true, "qa", "it");
		Student st10 = new Student("St10", "Nondr", 18, true, "qa", "it");
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
			System.out.println("===add students into group===");
			Student[] grArray = gr.getAllStudent();
			for(int i=0; i< grArray.length;i++){
				System.out.println(grArray[i]);
			}
			System.out.println("===sort students by lastname===");
			gr.sortByLastName();
			Student[] grSortArray = gr.getAllStudent();
			for(int i=0; i< grSortArray.length;i++){
				System.out.println(grSortArray[i]);
			}
			System.out.println("===sort students by parameter===");
			gr.sortByParametr(3);
			Student[] grSortby = gr.getAllStudent();
			for(int i=0; i< grSortby.length;i++){
				System.out.println(grSortby[i]);
			}
			System.out.println("===find student by lastname===");
			System.out.println(gr.serchStudent("Pondr"));
			System.out.println("===find students the voencom===");
			Student[] list = voencom.searchConscripts(grArray);
			for(int i=0; i<list.length;i++){
				System.out.println(list[i]);
			}
			System.out.println("===try add student bigest length array===");
			gr.addStudent(st11);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
