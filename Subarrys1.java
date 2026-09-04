package Arrays;

import java.util.Scanner;

public class Subarrys1 {

	public static void main(String[] args) {
		
		System.out.println("Main method started!");
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter arry elemnts:");
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("All aubarrys:");
		
		for(int i=0;i<n;i++) {
			for(int j = i;j<n;j++) {
				for(int k = i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				
				System.out.println();
				
			}
		}
	}

}
