package Arrays2;

import java.util.Scanner;

public class MoveZeros {

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter arry size");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("Enter arry elements");
		
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int index = 0;
		 for(int i = 0;i<n;i++) {
			 if(arr[i] != 0) {
				 arr[index] = arr[i];
				 index++;
			 }
		 }
		 while(index < n) {
			 arr[index ] = 0;
			 index++;
		 }
		 System.out.println("Array after moving zeros to the end:");
		 
		 for(int i =0;i<n;i++) {
			 System.out.print(arr[i]+" ");
		 }
		
	}

}
