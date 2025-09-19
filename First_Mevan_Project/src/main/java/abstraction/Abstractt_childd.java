package abstraction;

public class Abstractt_childd extends Abstractt_Parentt {
public void div()
{
	System.out.println("the sweet");
}//we cannot access child class property by abstract parent class reference. 
	public static void main(String[] args) {
		Abstractt_Parentt obj = new Abstractt_childd();
		obj.sum();
		obj.diff();
		Abstractt_childd obj1 = new Abstractt_childd();
        obj1.div();
	}

	@Override
	public void sum() {
		int a=87;
		int b=96;
		int c=a+b;
		System.out.println(c);
		
	}

}
