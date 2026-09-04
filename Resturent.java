package CoreJava_Mini_Project;

import java.util.Scanner;

public class Resturent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalAmount = 0;
        String choice = "";

        do {

            System.out.println("\n************************ GOLDEN TAJ RESTAURANT ***************************");
            System.out.println("1. Vegetarian");
            System.out.println("2. Non-Vegetarian");
            System.out.println("-----------------------------------------");
            System.out.print("Enter Category : ");

            String category = sc.nextLine();

            int amount = 0;

            switch (category) {

            case "Vegetarian" -> {

                System.out.println("\n----- Vegetarian Menu -----");

                System.out.println("Veg Manchuria");
                System.out.println("Gobi 65");
                System.out.println("Paneer Tikka");
                System.out.println("Crispy Corn");
                System.out.println("Paneer Butter Masala");
                System.out.println("Kadai Paneer");
                System.out.println("Mixed Veg Curry");
                System.out.println("Palak Paneer");
                System.out.println("Veg Biryani");
                System.out.println("Jeera Rice");
                System.out.println("Fried Rice");
                System.out.println("Pulao");
                System.out.println("Butter Naan");
                System.out.println("Plain Naan");
                System.out.println("Roti");
                System.out.println("Butter Roti");

                System.out.print("\nEnter Food Item : ");
                String foodItem = sc.nextLine();

                switch (foodItem) {

                case "Veg Manchuria" -> amount = 120;
                case "Gobi 65" -> amount = 140;
                case "Paneer Tikka" -> amount = 180;
                case "Crispy Corn" -> amount = 130;
                case "Paneer Butter Masala" -> amount = 240;
                case "Kadai Paneer" -> amount = 220;
                case "Mixed Veg Curry" -> amount = 180;
                case "Palak Paneer" -> amount = 230;
                case "Veg Biryani" -> amount = 180;
                case "Jeera Rice" -> amount = 140;
                case "Fried Rice" -> amount = 160;
                case "Pulao" -> amount = 170;
                case "Butter Naan" -> amount = 40;
                case "Plain Naan" -> amount = 30;
                case "Roti" -> amount = 20;
                case "Butter Roti" -> amount = 25;

                default -> {
                    System.out.println("Invalid Food Item");
                    continue;
                }

                }

            }

            case "Non-Vegetarian" -> {
            	System.out.println("\n------ Non Vegetarian Menu ------");
            	System.out.println("Chicken 65");
            	System.out.println("Chicken Manchurian");
            	System.out.println("Chicken Lollipop");
            	System.out.println("Chicken Tikka");
            	System.out.println("Chicken Curry");
            	System.out.println("Butter Chicken");
            	System.out.println("Chicken Biryani");
            	System.out.println("Mutton Biryani");
            	System.out.println("Mutton Curry");
            	System.out.println("Mutton Fry");
            	System.out.println("Fish Fry");
            	System.out.println("Fish Curry");
            	System.out.println("Prawns Fry");
            	System.out.println("Prawns Curry");
            	System.out.println("Egg Biryani");
            	System.out.println("Egg Curry");
            	System.out.println("Boiled Egg");
            	System.out.println("Omelette");

            	System.out.print("\nEnter Food Item : ");
            	String foodItem = sc.nextLine();
            	
            	switch (foodItem) {

            	case "Chicken 65" -> amount = 220;

            	case "Chicken Manchurian" -> amount = 240;

            	case "Chicken Lollipop" -> amount = 260;

            	case "Chicken Tikka" -> amount = 280;

            	case "Chicken Curry" -> amount = 240;

            	case "Butter Chicken" -> amount = 280;

            	case "Chicken Biryani" -> amount = 250;

            	case "Mutton Biryani" -> amount = 340;

            	case "Mutton Curry" -> amount = 320;

            	case "Mutton Fry" -> amount = 350;

            	case "Fish Fry" -> amount = 260;

            	case "Fish Curry" -> amount = 280;

            	case "Prawns Fry" -> amount = 320;

            	case "Prawns Curry" -> amount = 340;

            	case "Egg Biryani" -> amount = 180;

            	case "Egg Curry" -> amount = 160;

            	case "Boiled Egg" -> amount = 30;

            	case "Omelette" -> amount = 60;

            	default -> {
            	    System.out.println("Invalid Food Item");
            	    continue;
            	}

            	}



            }

            default -> {
                System.out.println("Invalid Category");
                continue;
            }

            }

            System.out.println("Price : ₹" + amount);

            System.out.print("Enter Quantity : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            int bill = amount * quantity;

            totalAmount += bill;

            System.out.println("Item Total : ₹" + bill);
            System.out.println("Current Bill : ₹" + totalAmount);

            System.out.print("\nDo you want to order another item? (Yes/No) : ");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("Yes"));

        double gst = totalAmount * 0.05;
        double finalBill = totalAmount + gst;

        System.out.println("\n==================================");
        System.out.println("         FINAL BILL");
        System.out.println("==================================");
        System.out.println("Food Bill : ₹" + totalAmount);
        System.out.println("GST (5%)  : ₹" + gst);
        System.out.println("Total Bill: ₹" + finalBill);
        System.out.println("==================================");
        System.out.println("Thank You... Visit Again 😊");

        sc.close();

    }

}