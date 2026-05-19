package com.studyopedia;

public class Employe {
	static int empId = 1000;
	int EmployeeNumber;
	{
		empId++;
		 EmployeeNumber=empId;
		
	}
	void display() {
		System.out.println("Employee id number:" + EmployeeNumber);
	}
	

	public static void main(String[] args) {
		Employe id1 = new Employe();
		id1.display();
		
		// TODO Auto-generated method stub

	}

}
