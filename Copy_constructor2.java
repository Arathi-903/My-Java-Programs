package constructors;

public class Copy_constructor2 {
	String StudentName;
	int rollNumber;
	int marks;
	 Copy_constructor2 (){
		 System.out.println("Copy constructed called!!");
	 }

	
	public Copy_constructor2(String StudentName) {
		this.StudentName = StudentName;
	}


	public Copy_constructor2(Copy_constructor2 m, int rollNumber,int marks) {
		this.StudentName = m.StudentName;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}


	public static void main(String[] args) {
		
		System.out.println("Main method started!");
		Copy_constructor2 c2 = new  Copy_constructor2("Priyanka");	
		c2.display() ;
		
		Copy_constructor2 c3 = new  Copy_constructor2(c2,2241,25);	
		c3.display() ;
		
	


	}
	
	

	void display() {
		System.out.println("Enter Student Name:"+StudentName);
		System.out.println("Enter roll number:"+rollNumber);
		System.out.println("Enter Student marks:"+ marks);
		System.out.println("************************************************************");
		
	}

}
