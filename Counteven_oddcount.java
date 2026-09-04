package Arrays;

import java.util.Scanner;
public class Counteven_oddcount {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a arry size:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the arry elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			int evencount1=0;
			int oddcount2=0;
		
		for(int j = 0;j<n;j++) {
			if(arr[j]%2==0) {
				evencount1++;
			}else {
				
				oddcount2++;
				
			}
		}
		System.out.println("This is even"+evencount1);
		System.out.println("This is odd"+oddcount2);
		

	}

}
