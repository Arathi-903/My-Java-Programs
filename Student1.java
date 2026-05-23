package com.studyopedia;

public class Student1 {
	static int StudentId = 101;
	int id;
	String name;
	Student1(){
		id = StudentId;
		StudentId++;
		
		
	}
	
	
	
	void display() {
		System.out.println(name);
		System.out.println(id);
	}
	

	public static void main(String[] args) {
		Student1 m1 =  new Student1();
		m1.name = "Arathi";
		m1.display();
		
		Student1 m2 =  new Student1();
		m2.name = "Arun";
		
		m2.display();

	}

}
