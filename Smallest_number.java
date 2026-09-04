package Arrays;

import java.util.Scanner;

public class Smallest_number {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter of arry size:");
		int n =sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter a arry elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int Smallest = arr[0];
		
		for(int j=1;j<n;j++) {
			if(arr[j]<Smallest) {
				arr[j] = Smallest;
			}
		}
		System.out.println("This is Smallest number of arr: "+Smallest);

	}

}
