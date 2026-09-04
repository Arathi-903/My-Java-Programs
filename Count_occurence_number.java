package Arrays;

import java.util.Scanner;

public class Count_occurence_number {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an arry size:");
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter an arry elemnts:");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter search count of an elements:");
		int search = sc.nextInt();
		int count = 0;
		for(int i =0;i<n;i++) {
			if(arr[i] == search) {
				
				count++;
				
				System.out.println("seach elemnt:"+search);
				System.out.println("count:"+count);
			}
			
		}
		
		

	}

}
