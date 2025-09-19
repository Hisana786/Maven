package aggregation;

public class Aggregation_Child {
	String college;
	String course;
	Aggregation_Pareent ref;
	public Aggregation_Child(String college,String course,Aggregation_Pareent ref)
	{
		this.college=college;
		this.course=course;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println("College is "+college);
		System.out.println("Course is "+course);
		System.out.println(ref.name+ref.age);
	}

	public static void main(String[] args) {
		Aggregation_Pareent obj1 = new Aggregation_Pareent("Fathima ",21);
		Aggregation_Child obj = new Aggregation_Child("CHMM","BCA",obj1);
		obj.display();
		
	}

}
