package inheritance;

public class Salary_Calculation extends Employee {
double hra, pf, totalsalary;
public void calculateSalary()
{
	hra=0.5*basicPay;
	pf=0.20*basicPay;
	totalsalary=(basicPay + hra + bonus) - (pf + deduction);
}
}
