package com.studyopedia;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Demo4 t = new Demo4();
		t.method1();
	}

		void method1() {
			method2();
			System.out.println("Method1 is started");
		}
		
		void method2() {
			method3();
			System.out.println("Method2 is started");
		
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
		
		

		// TODO Auto-generated method stub

	}


