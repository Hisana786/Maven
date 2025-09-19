package superkeyword;

public class Super_Constructor_Child extends Super_Constructor_Parent {
	public Super_Constructor_Child()
	{
		super(56);
		System.out.println("The Super Constructor Child is a child class");
	}
	public Super_Constructor_Child(float a)
	{
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		Super_Constructor_Child obj = new Super_Constructor_Child();
		Super_Constructor_Child object = new Super_Constructor_Child(4.5f);
	}

}
