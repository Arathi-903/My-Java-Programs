package com.studyopedia;

public class Student2 {
	static int count = 0;
	
	Student2(){
		count++;
	}
	
	void display() {
		System.out.println("Student Count:" +count);
	}

	public static void main(String[] args) {
		
		Student2 r2 = new Student2();
		r2.display();
		Student2 r3 = new Student2();
		r3.display();
		Student2 r4 = new Student2();
		r4.display();
		Student2 r5 = new Student2();
		r5.display();

		
	}

}
