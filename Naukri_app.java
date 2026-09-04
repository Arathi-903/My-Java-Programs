package ExtraPractice;

import java.util.Scanner;

public class Naukri_app {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Naukri Portal");
		System.out.println("Please Enter your Name:");
		String Name = sc.nextLine();
		System.out.println("Please enter your Age");
		int age = sc.nextInt();
			
		System.out.println("Please Enter Your Current Status:");
		String Status = sc.nextLine();
		
		
		sc.nextLine();
		System.out.println("Plese Enter your Passed out year:");
		int year = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Please Enter your  Skills");
		String skills = sc.nextLine();
		
		System.out.println("Please Enter Location");
		String Location = sc.nextLine();
		
		System.out.println("Please enter your mobile number");
		long num = sc.nextLong();
		
		 sc.nextLine();
		
		System.out.println("Please enter your email id");
		String em = sc.nextLine();

		System.out.println("Congratulations Arathi!\r\n"
				+ "You are eligible to apply for Java Developer Role.");
		
		if(year > 2024 &&  year <= 2026) {
			System.out.println("Your year of passed out is  eligible this job");
			if(age > 20 & age <= 30){
			System.out.println(" your age is elible ");	
				
			}else {
			System.out.println("Your age is not eligibel ");
			} 
		}else {
			System.out.println("Your Age is not eligible for this job sorry");
		} 			
			
		
		
		
	}

}
