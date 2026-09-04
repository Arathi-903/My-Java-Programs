package constructors;

public class Premetr_This {
int id;
String name;
int marks;
int percentage;

	Premetr_This(){
		System.out.println("one arg constructpor");
		this(101,"arathi",90);
		
		
	}
	Premetr_This(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public Premetr_This(int i, String string, int j) {
		System.out.println("three arg constructor");
		id=i;
		name=string;
		marks=j;
	}
void disp() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(marks);
	System.out.println(percentage);
}
	public static void main(String[] args) {
		System.out.println("Main method started!");
		Premetr_This p=new 	Premetr_This();
		p.disp();
		Premetr_This j=new 	Premetr_This(1,"hello");
		j.disp();
	}

}
