package interfaces;

public class Multi_Child implements Multi_Parent_1 , Multi_Parent_2{

	public static void main(String[] args) {
		Multi_Child obj = new Multi_Child();
		obj.show();
		obj.display();
	}

	@Override
	public void display() {
		System.out.println("This is interface 1");
		
	}

	@Override
	public void show() {
		System.out.println("This is interface 2");
		
	}

}
