package Arrays;

import java.util.Scanner;

public class Reverse_order {

	public static void main(String[] args) {
		System.out.println("Main method strted!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter barry size:");
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];

		System.out.println("Enter arry elements:");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements in reverse order:");
		
		for(int j = n-1;j>=0;j--) {
			System.out.print(arr[j]+ " ");
		}

	}

}
