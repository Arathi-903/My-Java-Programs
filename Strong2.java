package ExtraPractice;

import java.util.Scanner;

public class Strong2 {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;

		int sum =0;
		while(n>0) {
			int rem = n%10;
			n = n/10;
			sum+=findasatrong(rem);
		}
		
		if(temp == sum) {
			System.out.println("this is a strong number");
		}else {
			System.out.println("This is not strong");
		}
		
	}
	
	static int findasatrong(int n) {
		int sum =1;
		for(int i =1;i<=n;i++) {
			sum = sum*i;
		}
		return sum;
				
		
	}

}
