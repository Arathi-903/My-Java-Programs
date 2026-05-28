package Langugefundamentals_datatypes;

public class Datatypes {
	byte age;
	short year;
	int salary;
	float pi;
	double price;

	public static void main(String[] args) {
		Datatypes d1 = new Datatypes();
		d1.age = 21;
		d1.year = 2004;
		d1.salary = 50000;
		d1.price = 500;
		d1.pi = (float) 3.144;
		
		System.out.println("Byte value :" +d1.age);
		System.out.println("short value :" +d1.year);
		System.out.println("int value :" +d1.salary);
		System.out.println("float value :" +d1.pi);
		System.out.println("double value :" +d1.price);
		
		

	}

}
