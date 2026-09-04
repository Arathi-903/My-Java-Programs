package constructors;

public class Student {

	int id ;
	String name;
	String course ;
	
	
	Student(){
		display();
		 id = 101;
		name = "Arathi";
	 course = "Java full stack";
		display();

		
	}
	void display() {
		System.out.println("Student details:" +id );
		System.out.println(name );
		System.out.println( course );
	}
	
	public static void main(String[] args) {
		System.out.println("Man Method Started!");
		Student s1 = new Student();
	}


	}
	
	

