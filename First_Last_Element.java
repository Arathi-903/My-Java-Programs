package Arrays2;

public class First_Last_Element {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		int arr[] = {10,20,30,40,50,60};
		
		int temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
