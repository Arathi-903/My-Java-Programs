package com.studyopedia;

public class Demo {

	public static void main(String[] args) {
		System.out.println("hello java");
		method1();
		Demo t = new Demo();
		t.method2();
		
		Demo t2 = new Demo();
		t2.method3();
		
	}
	
	static void method1() {
		System.out.println("This is method1");
	}

	
	void method2() {
		System.out.println("This is method2");
		
	}
	void method3() {
		System.out.println("This is method3");
	}

}
