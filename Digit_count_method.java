package ExtraPractice;

import java.util.Scanner;

public class Digit_count_method {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum =findsum(n);
		System.out.println("Sum of digit count:"+sum);

	}

	static int findsum(int n) {
		int sum = 0 ;
		int rem =0;
		while(n>0) {
			rem = n%10;
			n = n/10;
			sum = sum+rem;
		}
				
		return sum;
		

	}
	

}
