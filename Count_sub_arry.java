package Arrays;

import java.util.Scanner;

public class Count_sub_arry {

	public static void main(String[] args) {
		System.out.println("Main method strted!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arry size:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter arry elements:");
		
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int count = n*(n+1)/2;
		System.out.println("Total number of subarrys:"+count);

	}

}
