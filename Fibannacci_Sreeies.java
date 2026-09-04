package ExtraPractice;

import java.util.Scanner;

public class Fibannacci_Sreeies {

	public static void main(String[] args) {
		System.out.println("Main method Started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		 Fibannacci_Sreeies obj = new Fibannacci_Sreeies();
	        obj.findfib(n);

	}
	void findfib (int n) {
		int n1 = 0;
		int n2 = 1;
     
		for(int i = 1; i<=n;i++) {
			int n3 = n1+n2;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
		
		}
		
		

		
	}


}
