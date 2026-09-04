package ExtraPractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number!");
		int n = sc.nextInt();
	
		for(int i = 1; i<=n/2; i++) {
			if(n%i==0) {
				System.out.println(i);
				
			}else {
				System.out.println("Your not a Factorial");
			}
			
			
		}
		
	
		

	}

}
