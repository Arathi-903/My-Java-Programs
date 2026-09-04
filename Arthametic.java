package ExtraPractice;

import java.util.Scanner;

public class Arthametic {

	public static void main(String[] args) {
		System.out.println("Main Methid Started");
		Scanner sc = new Scanner(System.in);
		String sn;
		do {
			System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter a1 number");
		int a1 = sc.nextInt();
		System.out.println("Please Enter the Symbol");
		char symbol = sc.next().charAt(0);
		
		double result = 0.0;
	

			switch(symbol) {
		case '+'  -> result = a+a1;
		case '-'  -> result = a-a1;
		case '*'  -> result = a*a1;
		case '%'  -> result = a%a1;
		case '/'  -> result = a/a1;
		default -> System.out.println("This is  symbol is not vallid!");		
	
		}
		System.out.println("Total Result Tell me Here:  "+result);
		System.out.println("Continue saye 'y' yes so can go the another step ok you say 'n' no ");
		sn = sc.next();
		}while(sn.equalsIgnoreCase("y"));


	}

}
