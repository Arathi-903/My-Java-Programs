package Arrays;

import java.util.Scanner;

public class Avg_sum {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Entere the size of an arry:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the arry Elements");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			
		}
		int sum =0;
		for(int j = 0; j<n;j++) {
			sum = sum+arr[j];
		}
		double avg = (double)sum/n;
		System.out.println("This sumof arry:"+sum);
		System.out.println("This is avg :"+avg);

	}

}
