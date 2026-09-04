package Arrays2;

public class Remove_duplicaticates {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		int[] arr = {10,20,30,20,40,10,50};
		System.out.println("Unique elements:");
		
		//i represents the current element.
		
		for(int i =0;i<arr.length;i++) {
//For every new element, initially we assume:"This element is not duplicate."

//So://duplicate = false
			boolean duplicate = false;
			//"Start from the first element and check all elements before the current i element."
			for(int j =0;j<i;j++) {
//j checks only the elements before i.
//
//i = current element
//j = previous elements
//
//Why?
//
//Because we want to check:
//
//"Did this element already appear before?"
				if(arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
			
			if(!duplicate) {
				System.out.print(arr[i]+"  ");
			}
		}

	}

}
//-----------------Take the current element → check whether it appeared before → if yes, skip it; if no, print it.-------------------
