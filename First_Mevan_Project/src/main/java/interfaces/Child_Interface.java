package interfaces;

public class Child_Interface implements Parent_Interface {

	public static void main(String[] args) {
		Parent_Interface obj = new Child_Interface();
		obj.sum();
	}

	@Override
	public void sum() {
		int a=65;
		int b=76;
		int c=a+b;
		System.out.println(c);
		
	}

}
