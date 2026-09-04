package Arrays;

import java.util.Scanner;

public class linear_Search {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a arry size:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter a arry elements:");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the search elemnts");
		int search = sc.nextInt();
		
		boolean found = false;
		
		for(int i =0;i<n;i++) {
			if(arr[i] == search) {
				System.out.println("Element found!");
				System.out.println("Element is a which index:"+i);
				found = true;
				break;
				
			}
		}
		if(!found) {
			System.out.println("Element not found");
		}

	}

}
