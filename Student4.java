package constructors;

public class Student4 {
	Student4 (){
		//one-arg constructor
		this(101,"priyanka");
		System.out.println("1-arg constructd");
	}

	
	//2-arg constructor
	public Student4(int id, String Name) {
	}
	

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Student4 s = new Student4 ();

	}
	
	void display() {
		
	
		
	}
	

}
