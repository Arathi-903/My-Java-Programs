package Arrays;

import java.util.Scanner;

public class Read_element {

	public static void main(String[] args) {
		System.out.println("Main method strted!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an arry:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements:");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are:");
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]+" ");
		}
		

	}

}
