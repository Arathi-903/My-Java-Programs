package ExtraPractice;

import java.util.Scanner;

public class Factorial_recursion {
	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		Factorial_recursion  a1 = new Factorial_recursion ();
	int result=	a1.findfactorial(a);
	System.out.println("Factorial of a numbers:"+result);
		
	}
	int findfactorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return  findfactorial(n-1)*n;
	}	
}
