package ExtraPractice;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp = n;
	
		int sum=0;
		while(n>0) {
			int digit = n%10;
			int fact = 1;
			
			
		for(int i =1;i<=digit;i++) {
			fact = fact*i;
			
			
		}sum = sum + fact;
			n = n/10;
		}if(sum == temp) {
			System.out.println("This is strong");
		}else {
			System.out.println("This is not strong number");
		}

	
	}

}
