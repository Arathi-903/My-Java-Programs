package Arrays;

import java.util.Scanner;

public class Posivtive_negative {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int pcount = 0;
		int ncount = 0;
		System.out.println("Enter a elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			
		}
		for(int j=0;j<n;j++) {
			if(arr[j]>n) {
				ncount++;
		
			}
			else {
				ncount++;
				
				
			}
		
		

	}
		System.out.println("This is positive:"+pcount);
		System.out.println("This is negative:"+ncount);
	}

}
