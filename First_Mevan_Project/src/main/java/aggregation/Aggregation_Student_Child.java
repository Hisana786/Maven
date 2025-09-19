package aggregation;

public class Aggregation_Student_Child {
	String address;
	Aggregation_Student_Parent ref;
	public Aggregation_Student_Child(String address,Aggregation_Student_Parent ref)
	{
		this.address=address;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(address);
		System.out.println(ref.name+ref.rollno);
	}
	public static void main(String[] args) {
		Aggregation_Student_Parent object = new Aggregation_Student_Parent("Fathima ",28);
		Aggregation_Student_Child obj = new  Aggregation_Student_Child("Samsam",object);
		 obj.display();

	}

}
