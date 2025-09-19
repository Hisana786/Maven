package superkeyword;

public class Super_Child extends Super_Parent{
	String color="Green";
	public void display()
	{
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_Child obj = new Super_Child();
		System.out.println(obj.color);
		obj.display();
	}

}
