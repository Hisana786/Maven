package inheritance;

public class Multi_Child extends Multi_Inter {
public void returns()
{
	System.out.println("The Child class in Multilevel Inheritance");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multi_Child obj = new Multi_Child();
obj.display();
obj.show();
obj.returns();
	}

}
