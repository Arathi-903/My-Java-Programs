package com.studyopedia;

public class Demo2 { 

	void hello() {
		System.out.println("Hello guys, Good morning");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		welcom();
		Demo2 t = new Demo2();
		t.hello();
	    

	}
	
	public static void welcom() {
		System.out.println("Welcom to java world");
	}

}
