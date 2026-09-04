package ExtraPractice;

import java.util.Scanner;

public class Palindrome_reverse {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int rev = findreverse(n);
		int temp = n;
	
		System.out.println("TO print a revertse number:"+rev);
		if(temp==rev) {
			System.out.println("This a palindrome number");
		}else {
			System.out.println("This a not palindrome");
		}
	}

	 static int findreverse(int n) {
		 int rev =0;
		 int rem=0;
	
		while(n>0) {
			rem = n%10;
			n = n/10;
			rev = rev*10+rem;
			
		}
		return rev;
	}
	 

}
