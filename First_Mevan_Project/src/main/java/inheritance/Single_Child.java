package inheritance;

public class Single_Child extends Single_Inheritance {
	public void display(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Single_Child object = new Single_Child();
object.display(69,43 );
object.sum(45, 56);
object.mult(5, 10);
Single_Inheritance obj = new Single_Inheritance();
obj.sum(9, 5);
obj.mult(7, 8);

	}

}
