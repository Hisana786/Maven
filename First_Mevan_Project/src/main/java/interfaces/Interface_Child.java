package interfaces;

public class Interface_Child implements Interface_Parent{

	public static void main(String[] args) {
		Interface_Child obj = new Interface_Child();
		obj.sum();
		obj.diff();
		Interface_Parent.show();
	}

	@Override
	public void sum() {
		int c = a+b;
		System.out.println(c);
		
	}

}
