package ExtraPractice;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Scanner sc = new Scanner(System.in);
		String ac;
		do {
			System.out.println("Welcome to Vcube ATM selct which one ");
			System.out.println("1.CheckAmount");
			System.out.println("2.Deposite");
			System.out.println("3.Widthdraw");
			String ATM = sc.nextLine();
			long a = 20000;
			switch (ATM) {
			case "one" -> {
				System.out.println("Check your balance = 20000");
			}
			case "Two" -> {
				System.out.println("Deposite");
				System.out.println("Enter How much Amount deposite:");
				long m = sc.nextInt();
				double amount = m+a;
				System.out.println("Deposite;"+amount);
				sc.nextLine();
			}
			case "Three" -> {
				System.out.println("Widthdraw");
				System.out.println("Enter how much amount withdraw");
				long m = sc.nextInt();
				double amount = m-a;
				System.out.println("Withdraw amount:"+amount);
				sc.nextLine();
			}
			default -> {
				System.out.println("This is invold bank account");
			}
			}
			System.out.println("You want to continue say yes/no");

			ac = sc.nextLine();

		} while (ac.equalsIgnoreCase("Yes"));
		{
			System.out.println("Thank you to vist my ATM");

		}

	}

}
