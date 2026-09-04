package Arrays;

public class mergesortarry {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		int[] arr1 = {1,4,7,8,10};
		int arr2[] = {2,3,9};
		for(int i=0;i<arr2.length ;i++) {
			int temp = arr2[i];
			int j = arr1.length-1;
			if(temp <arr2[j]) {
				arr2[i] = arr1[j];
				arr1[j] = temp;
				for(int k = j; k> 0  && arr1[k]<arr1[k-1];k--) {
					int t = arr1[k];
					arr1[k] = arr1[k-1];
					arr1[k-1] = t;
					
				}
				
			}
		}
		System.out.println("output:");
		for(int x : arr1)
			System.out.print(x+" ");
		for (int x : arr2)
			System.out.print(x+" ");
			

	}

}
