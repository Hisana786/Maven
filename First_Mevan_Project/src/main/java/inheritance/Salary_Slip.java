package inheritance;

public class Salary_Slip extends Salary_Calculation{
public void printSlip()
{
	calculateSalary();
    System.out.println("----- Salary Slip -----");
    System.out.println("Basic Pay : " + basicPay);
    System.out.println("Deduction : " + deduction);
    System.out.println("Bonus     : " + bonus);
    System.out.println("HRA       : " + hra);
    System.out.println("PF        : " + pf);
    System.out.println("Total Salary : " + totalsalary);
}
	public static void main(String[] args) {
		Salary_Slip obj = new Salary_Slip();
        obj.printSlip();
	}

}
