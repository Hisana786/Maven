package encapsulation;

public class Encapsulation_Second {

	public static void main(String[] args) {
		Encapsulation_First obj = new Encapsulation_First();
		obj.setName("Fathima");
		obj.setNo(90483808);
		obj.setAge(21);
		obj.setAddress("Samsam");
		System.out.println(obj.getName());
		System.out.println(obj.getNo());
		System.out.println(obj.getAge());
		System.out.println(obj.getAddress());
	}

}
