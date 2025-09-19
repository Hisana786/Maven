package interfaces;

public class Hdfc implements RBI{

	public static void main(String[] args) {
		RBI obj = new Hdfc();
        obj.Deposit();
	}

	@Override
	public void Deposit() {
		double amount = 15000;
		int year = 6;
		int n=1;
		double maturity = amount*Math.pow((1+Rate/n), n*year);
		System.out.println("Deposited Amount : " + amount);
        System.out.println("Duration (Years) : " + year);
        System.out.println("Interest Rate    : " + (Rate * 100) + "%");
        System.out.println("Maturity Amount  : " + maturity);
	}
}
