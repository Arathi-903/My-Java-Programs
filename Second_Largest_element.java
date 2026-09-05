package Arrays2;

public class Second_Largest_element {

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		int arr[] = {10,5,20,8,15};
		int n = arr.length;
		
		
		int largest = arr[0];
		int second = arr[0];
		
		
		if(second > largest) {
			int temp = largest;
			largest = second;
			second = temp;	
		}
		
		
		for(int i = 2;i<n;i++) {
			if(arr[i] > largest) {
				second = largest;
				largest = arr[i];	
			}
			
			
			else if(arr[i] > second) {
				second = arr[i];
				
			}
		}
		
		System.out.println("Second largest element is:"+second);
		
		
	}
		
}


