package constructors;

public class Account {
	
	String AccountHolderName;
	long AccountNumber;
	
	Account(){
		System.out.println("No-arg constructor called!");
	}
	
	Account(String AccountHolderName, long AccountNumber){
		
		this.AccountHolderName = AccountHolderName;
		
		this.AccountNumber=AccountNumber;
		System.out.println("Account arg constructor called!");
	}

	public static void main(String[] args) {
		System.out.println("Parent main method called!");
		

	}

}



class SavingsAccount extends Account {
	
	
	public SavingsAccount(String AccountHolderName, long AccountNumber) {
		super(AccountHolderName,AccountNumber);
		
		System.out.println("child constructor called");
	}

	public static void main(String[] args) {
		System.out.println("Child  main method called!");
		SavingsAccount s1 = new SavingsAccount("Jenne Arathi",22410407);
		
		System.out.println("Enter AccountHolderName:"+s1.AccountHolderName);
		
		System.out.println("Enter AccountNumber:"+s1.AccountNumber);
		
		
		
	}
	
	
	
	
	
}
