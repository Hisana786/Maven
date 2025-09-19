package abstraction;

public class Abstract_Child extends Abstract_Parent{

	public static void main(String[] args) {
		Abstract_Child obj = new Abstract_Child();
		obj.sum();
		System.out.println(obj.diff());
	}

	@Override
	public void sum() {
		int a=3;
		int b=4;
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public int diff() {
		int a=8;
		int b=5;
		int c=a-b;
		return c;
	}

}
