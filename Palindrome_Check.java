package ExtraPractice;

import java.util.Scanner;

public class Palindrome_Check {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println(n+"is a Palindrome Number");
        } else {
            System.out.println(n+"is Not a Palindrome Number");
        }
    }
    
    
    
   static boolean isPalindrome(int n) { 	
        int temp = n;    
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if(temp == rev) {
        	return  true;
        } else{
        	return false;
        }
        
    }

}