package Arrays;

import java.util.Scanner;

public class Employee {
    int id;
    String name;
    String type;
    double salary;
    double netsalary;
    
    public Employee( int id,
    String name,
    String type,
    double salary) {
    	this.id = id;
    	this.name = name;
    	this.type = type;
    	this.salary = salary;
    }
    void calculateSalary() {
    	
    }
    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Type : " + type);
        System.out.println("Basic Salary : " + salary);
        System.out.println("Net Salary : " +netsalary);
    }
}




