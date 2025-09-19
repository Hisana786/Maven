package exception;

public class Custom_Exception {

	public static void main(String[] args) throws VotingException {
		int age=12;
		if(age>=18)
		{
			System.out.println("Elgible");
		}
		else
		{
			throw new VotingException("Not Elgible");
		}
	}
}
