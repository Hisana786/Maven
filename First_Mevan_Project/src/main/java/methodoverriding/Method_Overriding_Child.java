package methodoverriding;

public class Method_Overriding_Child extends Method_Overriding_Parent{
	
	@Override
	public void display() {
		super.display();
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		 Method_Overriding_Child obj = new  Method_Overriding_Child();
obj.display();
	}

}
