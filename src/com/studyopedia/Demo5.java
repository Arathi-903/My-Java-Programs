package com.studyopedia;

class Student{
	int id = 101;
	String name = "Arathi";
	int marks = 100;


void display() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(marks);
}
}
public class Demo5 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();		// TODO Auto-generated method stub

	}


}
