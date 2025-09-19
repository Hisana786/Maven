package exception;

public class Exceptions {

	public static void main(String[] args) {
		try
		{
		int a=5;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException c)
		{
			System.out.println("Exception handled");
		}
		finally
		{
			System.out.println("End of the code");
		}
		try
		{
		int a[]= {4,5,6};
		for(int i=0;i<=3;i++)
		{
			System.out.println(a[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Exception handled");
		}
		finally
		{
			System.out.println("End of code");
		}
		try
		{
		String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException s)
		{
			System.out.println("Exception handled");
		}
		finally
		{
			System.out.println("End of code");
		}
	}

}
