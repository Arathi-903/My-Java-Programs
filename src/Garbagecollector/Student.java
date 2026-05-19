package Garbagecollector;

public class Student {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized method called");
	
	}

	public static void main(String[] args) {
		//Student s1 = new Student();
		//Student s2 = new Student();
		//Student s3 = new Student();
		//Student s4 = new Student();
		display();
		
		
		//s1 = null;
		
		
		
		//Re-assign 
		
		//s2=s3;
		
		
		//Anonymous object
		 //new Student();
		
		 
		 //Island of Isolation
		 
		// s4 = s2;
		// s2 = s3;
		// s3 = s4;
		 
		// s3 = null;
		// s2 = null;
		// s4 = null;
		 
		
		 
		System.gc();	

	}
	
	//scope
	
	 static void display() {
		Student s5 = new Student();
		
	
		
	}
	

}
