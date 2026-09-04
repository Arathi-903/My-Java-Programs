package ExtraPractice;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a range of how many prime numbers if you want to print..?");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i <= n; i++) {
			if (isPrimr(i)) {

				count++;

				if (isPrimr(count)) {
					System.out.println(i + " is the " + count + " Prime Number");
				}

			}
		}

	}

	static boolean isPrimr(int n) {
		boolean flage = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flage = false;
				break;
			}

		}

		return flage;
	}

}
