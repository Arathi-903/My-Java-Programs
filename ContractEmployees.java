package Arrays;

public class ContractEmployees extends Employee {
	

	public ContractEmployees(int id, String name, String type, double salary) {
		super(id, name, "Contract Employee", salary);
	}
	@Override
	 void calculateSalary() {
		this.netsalary = this.salary;
		System.out.println(this.netsalary);	
  }

}
