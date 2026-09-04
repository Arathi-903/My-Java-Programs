package ExtraPractice;

import java.util.Scanner;

public class Age_Desciption {

	public static void main(String[] args) {
		System.out.println("main method started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age = sc.nextInt();
		if(age > 60) {
			System.out.println("Your a Senior Citizens bro");
		}
		else if(age > 35 && age < 60) {
			System.out.println("Your a middle age peples bro ");
			
		}
		else if(age > 19 && age < 35) {
			System.out.println("Your a yough peopels bro");
		}
		else if(age > 13 && age < 19 ) {
			System.out.println("Your a teen ages peoples");
		}
		
		else if(age > 5 && age < 12) {
			System.out.println("Your a childers bro");
			
		}
		
		else if(age > 0 && age < 5) {
			System.out.println("Your a kids bro");
		}else {
			System.out.println("First u tell me You age ");
		}
		

	}

}
