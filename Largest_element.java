package Arrays;

import java.util.Scanner;

public class Largest_element {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the arr of size:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a arry elemnts:");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int Largest = arr[0];
		for(int j=1;j<n;j++) {
			if(arr[j]>Largest) {
				Largest = arr[j];
				
			}
		}
		System.out.println("This is Largest :"+Largest);

	}

}
