package ExtraPractice;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter b number");
		int b = sc.nextInt();
		int num1=a;
		int num2=b;
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		int gcd=a;
	System.out.println("this is gcd:"+a);
	int lcm=(num1*num2)/gcd;
	System.out.println("this is lcm:"+lcm);

	}

}
