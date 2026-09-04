package Arrays;

import java.util.Scanner;

public class Subbarylength3 {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a arry size:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter arry elements:");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Subbery of length3:");
		
		for(int i =0;i<n-2;i++) {
			System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]);	
		}

	}

	
}

