package abstraction;

public class FullTimeEmployee extends Employee{

	public FullTimeEmployee(String name, double paymentPerHour) {
		super(name, paymentPerHour);
		
	}

	public static void main(String[] args) {
		Employee obj = new Contractor("Archana",105,6);
        Employee obj1 = new FullTimeEmployee("Anas",130);
        obj.calculateSalary();
        obj1.calculateSalary();
	}

	@Override
	public void calculateSalary() {
		double salary=paymentPerHour*8;
		System.out.println("Full-Time Employee "+name);
		System.out.println("Salary: "+salary);
	}

}
