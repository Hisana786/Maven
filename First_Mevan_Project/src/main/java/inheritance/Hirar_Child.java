package inheritance;

public class Hirar_Child extends Hirar_Parent{
	public void display()
	{
		System.out.println("The first child class in Hierarchial Inheritance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hirar_Child object = new Hirar_Child();
object.show();
object.display();
System.out.println(object.a);
	}

}
