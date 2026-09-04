package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Absoulte_difference {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a arry size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter arry a elemnts:");
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int minDiff = Integer.MAX_VALUE;
		int a = 0;
		int b = 0;
		for(int i =0;i<arr.length-1;i++) {
			int diff = arr[i+1]-arr[i];
			if(diff < minDiff) {
				minDiff = diff;
				a = arr[i];
				b = arr[i+1];
			}
		}
		System.out.println("["+a+","+b+"]");
		
	}
	

}
