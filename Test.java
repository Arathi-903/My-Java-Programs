package com.studyopedia;

public class Test {
	static int x = 10;
	
	{
		x+=5;
	}
	Test(){
		x+=10;
	}

	public static void main(String[] args) {
		new Test();
		new Test();
		
		System.out.println(x);
		

	}

}
