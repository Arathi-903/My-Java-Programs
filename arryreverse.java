package Arrays;

import java.util.Scanner;

public class arryreverse {

	public static void main(String[] args) {
		
		System.out.println("Main method start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arry size:");
		int n = sc.nextInt();		
		int arr[] = new int[n];
		
		
		System.out.println("Enter arry elements:");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int start = 0;
		int end = n-1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		System.out.println("Reverse arry:");
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		
	}

}
