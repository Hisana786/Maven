package methodoverriding;

public class Overriding_Child extends Overriding_Parent{
	public void display()
	{
		super.display();
		System.out.println("This is child class");
	}
	public int sum(int a,int b)
	{
		System.out.println(super.sum(7, 8));
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		Overriding_Child obj = new Overriding_Child();
		obj.display();
		System.out.println(obj.sum(9, 9));
	}

}
