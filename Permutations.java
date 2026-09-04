package Arrays;

import java.util.Arrays;

public class Permutations {
	
	static void permute(int[] arr,int start) {
		if(start == arr.length) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		for(int i = start;i<arr.length;i++ ) {
			int temp = arr[start];
			arr[start] = arr[i];
			arr[i] = temp;
			
			permute(arr,start+1);
			temp = arr[start];
			arr[start] = arr[i];
			arr[i] = temp;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Main method started!");
		int []arr = {1, 2, 3};
		permute(arr,0);
		

	}

}
