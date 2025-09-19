package encapsulation;

public class Bank_Child {

	public static void main(String[] args) {
		int userPin=1234;
		Bank_Parent obj = new Bank_Parent();
		obj.setPin(userPin);
		if(obj.getPin())
		{
			System.out.println("Pin accepted");
		}
		else
		{
			System.out.println("Invalid pin");
		}
	}
}
