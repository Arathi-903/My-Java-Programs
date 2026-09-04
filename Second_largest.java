package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Second_largest {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the arry:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter arry elements:");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Second largest elements:"+arr[n-2]);

	}

}
