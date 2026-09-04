package ExtraPractice;

import java.util.Scanner;

public class Foorlopp_1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int product = 1;
		for(int i = 1; i<=n; i++){
			product = product * i;
			System.out.println("product of numbers:"+product);
			
			
		}
		
}

}
