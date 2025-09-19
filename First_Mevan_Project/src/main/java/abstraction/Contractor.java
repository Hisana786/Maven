package abstraction;

public class Contractor extends Employee{
private int workingHours;
public Contractor(String name, double paymentPerHour, int workingHours)
{
	super(name, paymentPerHour);
	this.workingHours=workingHours;
}
@Override
public void calculateSalary() {
	double salary=paymentPerHour*workingHours;
	System.out.println("Contractor "+name);
    System.out.println("Salary: "+salary);
}
}
