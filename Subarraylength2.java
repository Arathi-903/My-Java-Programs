package Arrays;

import java.util.Scanner;

public class Subarraylength2 {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arry size:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter arry of elements:");
		
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();	
		}
		
		System.out.println("Subarrays of length2:");
		for(int i =0;i<n-1;i++) {
			System.out.println(arr[i]+" "+arr[i+1]+" ");
		}

	}

}
