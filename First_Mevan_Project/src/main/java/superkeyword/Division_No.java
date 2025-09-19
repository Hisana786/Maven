package superkeyword;

public class Division_No extends Addition_No{
public void show()
{
	super.sum();
	int a=82;
	int b=8;
	int c=a+b;
	if(c % 10 == 0)
	{
		System.out.println("The no is divisible by 10");
	}
	else
	{
		System.out.println("The no is not divisible by 10");
	}
}
	public static void main(String[] args) {
	Division_No obj = new Division_No();	
    obj.show();
	}

}
