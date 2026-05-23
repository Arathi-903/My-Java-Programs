package com.studyopedia;

public class Test2 {
	static int x = m1();
	static {
		System.out.println("staticBlock1");
	}
	
	static int m1() {
		System.out.println("Static Method");
		return 10;
		
	}
	{
		System.out.println("instant Block1");
	}
	Test2(){
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Instant Block2");
	}
	
	static {
		System.out.println("Static Block2");
	}

	public static void main(String[] args) {
		Test2  t = new Test2();
			System.out.println("main metod");

	}

}
