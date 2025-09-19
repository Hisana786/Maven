package superkeyword;

public class Super_Method_Child extends Super_Method_Parent {
	public void display()
	{
		this.div();
		super.show();
		int a=45;
		int b=5;
		int c=a-b;
		System.out.println(c);
	}
	public void div()
	{
		int a=45;
		int b=5;
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Super_Method_Child obj = new Super_Method_Child();
		//obj.show();
		obj.display();
		int s=obj.mult();
		System.out.println(s);
	}

}
