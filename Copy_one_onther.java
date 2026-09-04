package Arrays;

import java.util.Scanner;

public class Copy_one_onther {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a arry size:");
		int n = sc.nextInt();
		
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		System.out.println("Enter a arry elements:");
		for(int i =0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		
		for(int i =0;i<n;i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("original arry");
		for(int i =0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("Copy arry");
		
		for(int i =0;i<n;i++) {
			System.out.print(arr2[i]+" ");
		}

	}

}
