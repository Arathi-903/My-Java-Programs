package com.studyopedia;

public class Bank {

	static int seralno = 1235760;
	
	{
		seralno++;
		accountnumber=seralno;
	}
	
	int accountnumber;
	String name;
	int balance;
	int mobile;

	void display() {
		System.out.println(name);
		System.out.println(accountnumber);
		System.out.println(balance);
		System.out.println(mobile);
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		b.name = "Aravind";
		b.balance = 0;
		b.mobile = 9032984;
		b.display();
		
		
		Bank m = new Bank();
		m.name = "Arathi";
		m.balance = 140;
		m.mobile = 93927224;
		m.display();

	}

}
