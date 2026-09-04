package Arrays;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
    	FullTimeemployess arathi = new FullTimeemployess(101, "Arathi", "full time", 30000);
    	PartTimeEmployees Priya = new PartTimeEmployees(101, "priya", "part time", 30000);
    	ContractEmployees Kashi = new ContractEmployees(101, "kashi", "Contract", 30000);
    	arathi.display();
    	Priya.display();
    	Kashi.display();

        
    }
}



