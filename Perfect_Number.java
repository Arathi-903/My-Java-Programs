package ExtraPractice;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		//6,28,496,8128
		
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		
		
		for (int i = 1; i <=n; i++) {
			
			int sum = 0;
			for(int j = 1; j<=i/2; j++) {
				if(i% j == 0){
					sum = sum+j;
					
				}	
			}
			if(sum == i) {
				System.out.println("This is perfect :"+i);
			}
			
		}
	

	}

}
