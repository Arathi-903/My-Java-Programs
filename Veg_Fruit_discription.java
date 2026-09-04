package ExtraPractice;

import java.util.Scanner;

public class Veg_Fruit_discription {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		int totalAmount = 0;
		String retryChoiceOption;

		do {
			System.out.println("Enter the category you want to buy from below options: ");
			System.out.println("1.veg/n2.fruit");
			String des = sc.nextLine();
			switch (des) {
				case "veg" -> {
					System.out.println("Enter the vegetable item you want to buy from below options: ");
					System.out.println("1.carrot/n2.pottatos/n3.drumsticks/n4.mirchi/n5.amla");
					String item = sc.nextLine();
					switch (item) {
						case "carrot" -> {
							System.out.println("Carrot is 60 ruppess");
							System.out.println("Enter quantity you want");
							int quantity = sc.nextInt();
							int price = quantity * 60;
							totalAmount += price;
						}
						case "pottatos" -> {
							System.out.println("pottatos is 60 ruppess");
							System.out.println("Enter quantity you want");
							int quantity = sc.nextInt();
							int price = quantity * 60;
							totalAmount += price;
						}
						case "drumsticks" -> {
							System.out.println("drumsticks is 60 ruppess");
							System.out.println("Enter quantity you want");
							int quantity = sc.nextInt();
							int price = quantity * 60;
							totalAmount += price;
						}
						case "mirchi" -> {
							System.out.println("mirchi is 60 ruppess");
							System.out.println("Enter quantity you want");
							int quantity = sc.nextInt();
							int price = quantity * 60;
							totalAmount += price;
						}
						case "amla" -> {
							System.out.println("Carrot is 60 ruppess");
							System.out.println("Enter quantity you want");
							int quantity = sc.nextInt();
							int price = quantity * 60;
							totalAmount += price;
						}
						default -> {
							System.out.println("this is a not a vigetable");
							System.out.println("Enter quantity you want");
							int quantity = sc.nextInt();
							int price = quantity * 60;
							totalAmount += price;
						}
					}
	
				}
				case "fruit" -> {
					System.out.println("Enter the vegetable item you want to buy from below options: ");
					System.out.println("1.grapess/n2.apples/n3.bannanas/n4.muskmillon/n5.orange");
					String item = sc.nextLine();
					switch (item) {
						case "grapess" -> {
							System.out.println("grappes is 70 ruppess");
							System.out.println("Enter quantity you want");
							int quantity = sc.nextInt();
							int price = quantity * 70;
							totalAmount += price;
						}
						case "apples" -> {
							System.out.println("apples is 250 ruppess");
							System.out.println("Enter quantity you want");
							int quantity = sc.nextInt();
							int price = quantity * 250;
							totalAmount += price;
						}
						case "bannanas" -> {
							System.out.println("bananas is 60 ruppess");
							System.out.println("Enter quantity you want");
							int quantity = sc.nextInt();
							int price = quantity * 60;
							totalAmount += price;
						}
						case "muskmillon" -> {
							System.out.println("muskmillon is 60 ruppess");
							System.out.println("Enter quantity you want");
							int quantity = sc.nextInt();
							int price = quantity * 60;
							totalAmount += price;
						}
						case "orange" -> {
							System.out.println("orange is 70 ruppess");
							System.out.println("Enter quantity you want");
							int quantity = sc.nextInt();
							int price = quantity * 70;
							totalAmount += price;
						}
						default -> {
							System.out.println("This is not a fruit");
						}
					}
				}
			}
			System.out.println("total cost of all items : "+totalAmount);
			System.out.println("Do you want to add more items again, choose yes or no");
			sc.nextLine();
			retryChoiceOption=sc.nextLine();
			System.out.println("Your option is: "+retryChoiceOption);
		}while (retryChoiceOption.equalsIgnoreCase("yes"));
	}
}
