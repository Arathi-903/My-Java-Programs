package ExtraPractice;

import java.util.Scanner;

public class Swiches_Case {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int VcubeDetails = sc.nextInt();
		switch(VcubeDetails ){
		case 1:
			System.out.println("Hey Iam Arathi");
			System.out.println("Iam Learning Java full Stack");
			break;
		case 2:
			System.out.println("Hi Iam Priyanka");
			System.out.println("Iam Learning Java Full Stack at Vcube");
			break;
		case 3:
			System.out.println("I am Manu ");
			System.out.println("Iam Learning Java full Stack from hyd");
			break;
			
		}

	}

}
