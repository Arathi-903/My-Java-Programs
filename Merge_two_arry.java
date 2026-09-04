package Arrays2;

public class Merge_two_arry {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		int a[]  = {1,2,3,4};
		int b[] = {5,6,7,8};
		int []c = new int[a.length+b.length];
		for(int i =0;i<a.length;i++) {
			c[i] = a[i];
		}
		for(int j =0;j<b.length;j++) {
			c[a.length+j] = b[j];
		}
		for(int k =0;k<c.length;k++) {
			System.out.print(c[k]+" ");
		}

	}

}
