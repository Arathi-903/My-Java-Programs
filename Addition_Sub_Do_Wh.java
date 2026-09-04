package ExtraPractice;

import java.util.Scanner;

public class Addition_Sub_Do_Wh {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		Scanner sc = new Scanner(System.in);
		String n;
		do {
			System.out.println("Choose below options");
			System.out.println("1.Addition");
			System.out.println("2.Subraction");
			int num = sc.nextInt();
			switch(num) {
			case 1 ->{
				System.out.println("Addition of number");
				System.out.println("Enter a number");
				int m = sc.nextInt();
				System.out.println("Enter a1 number");
				int y = sc.nextInt();
				System.out.println("Addition of two numbers:"+(m+y));
			}
			case 2 ->{
				System.out.println("Subraction of number");
				System.out.println("Enter a number");
				int m = sc.nextInt();
				System.out.println("Enter a1 number");
				int y = sc.nextInt();
				System.out.println("Subtraction of two numbers:"+(m-y));
			}
			default -> System.out.println("This is not a addition and sub ");
			}
			System.out.println("You want continue say yes/no");
			n = sc.next();
		}while(n.equalsIgnoreCase("Yes")) ;
		System.out.println("Thank you Program is Ended");
			
		}

	}


