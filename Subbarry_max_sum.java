package Arrays;

import java.util.Scanner;

public class Subbarry_max_sum {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arry size:");
		int n = sc.nextInt();
		
		int arr[] = new int[n] ;
		
		System.out.println("Enter a arry elements: ");
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxsum = Integer.MIN_VALUE;
		for(int i =0;i<n;i++) {
			for(int j =i;j<n;j++) {
				int sum =0;
				for(int k =i;k<=j;k++) {
					sum = sum+arr[k];
				}
				if(sum > maxsum) {
					maxsum = sum;			
				}
			}
		}
		
		System.out.println("Max of subarry sum:"+maxsum);

	}

}
