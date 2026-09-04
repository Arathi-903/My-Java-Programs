package Arrays;

import java.util.Scanner;

public class Subbary_Sum_target {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arry size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter a arry elements:");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter a target sum:");
		int target  = sc.nextInt();
		boolean found = false;
		
		for(int i =0;i<n;i++) {
			for(int j =i;j<n;j++) {
				int sum =0;
				for(int k =i;k<=j;k++) {
					sum = sum+arr[k];
					
				}
				
				if(sum == target) {
					System.out.println("Subarry:");
					
					for(int k =i;k<=j;k++) {
						System.out.print(arr[k]+" ");
					}
					System.out.println();
					System.out.println("Sum :"+sum);
					
					found = true;
				}
			}
		}
		if(!found) {
			System.out.println("No subarry found");
		}

	}

}
