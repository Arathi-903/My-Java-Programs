package ExtraPractice;

import java.util.Scanner;

public class prime2_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Prime Number: ");
        int n = sc.nextInt();

        if (!ifprime(n)) {
            System.out.println(n + " is Not a Prime Number");
           
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (ifprime(i)) {
                count++;
            }
        }

        System.out.println(n + " is the primen number : " + count + " : nth  Prime Number");

        sc.close();
    }

    static boolean ifprime(int n) {

        boolean prime = true;

        if (n == 0 || n == 1) {
            prime = false;
        }

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}