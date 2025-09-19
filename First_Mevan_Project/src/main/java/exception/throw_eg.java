package exception;

public class throw_eg {

	public static void main(String[] args) throws Exception {
		int age = 12;
	    if(age>=18)
		{
			System.out.println("Elidible for voting");
		}
		else
		{
			throw new Exception ("Not Elgible");
		}
	}
}
