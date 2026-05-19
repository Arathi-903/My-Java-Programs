package com.studyopedia;

public class Demo3 {
	

	void method1() {
		method2();
		System.out.println("Method1 is started");
	}
	
	void method2() {
		System.out.println("Method2 is started");
		method3();
	}
	

	static void method3() {
		method4();
		System.out.println("Method3 is started");
		
	
		
	}
	

	static void method4() {
		Demo3 t2 = new Demo3();
		t2.method5();
		System.out.println("Method4 is started");
	
		
	}
	
	 void method5() {
		 method6();
		
		System.out.println("Method5 is started");
		
	}
	 
	 static void method6() {
			
		System.out.println("Method6 is started");
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method strated");
		Demo3 t = new Demo3();
		t.method1();
		// TODO Auto-generated method stub

	}

}
