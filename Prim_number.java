package ExtraPractice;

import java.util.Scanner;

public class Prim_number {

    public static void main(String[] args) {

        System.out.println("Main method started!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        if (ifprime(n)) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }

       
    }

    static boolean ifprime(int n) {

        boolean result = true;

        if (n == 0 || n == 1) {
            result = false;
        }

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}