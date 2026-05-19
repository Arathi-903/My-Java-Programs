package com.studyopedia;

public class Product {

	static String StoreName = "Amozon";
	int productId;
	String productName;
	int productPrice;

	void details() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(productPrice);
		System.out.println(StoreName);		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product s1 = new Product();
		s1.productId=1;
		s1.productName="Arathi";
		s1.productPrice= 20;	
		s1.details();		
		
		Product s2 = new Product();
		s2.productId=2;
		s2.productName="Arun";
		s2.productPrice= 40;
		s2.details();
		
	}

}
