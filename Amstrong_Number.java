package ExtraPractice;

import java.util.Scanner;

public class Amstrong_Number {

    public static void main(String[] args) {

        System.out.println("Main method started!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        boolean status = isAmstrong(n);

        if (status) {
            System.out.println(" is an Armstrong Number:"+n);
        } else {
            System.out.println(" is not an Armstrong Number:"+n);
        }

        sc.close();
    }

    static boolean isAmstrong(int n) {

        boolean status = false;

        int count = 0;
        int rem;
        int sump = 0;

        int temp = n;
        int n1 = n;

        // Count the number of digits
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            count++;
        }

        // Calculate the sum of each digit raised to the power of count
        while (n1 > 0) {
            rem = n1 % 10;
            n1 = n1 / 10;

            sump =  (int) (sump+Math.pow(rem, count));
        }

        // Compare the original number with the calculated sum
        if (temp == sump) {
            status = true;
        }

        return status;
    }
}