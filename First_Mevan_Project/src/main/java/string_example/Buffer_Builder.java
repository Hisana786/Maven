package string_example;

public class Buffer_Builder {

	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("Hello");
		System.out.println(s);
		StringBuilder n= new StringBuilder(" Hai");
		System.out.println(n);
System.out.println(s.append(" World"));
System.out.println(s.append(n));
System.out.println(n.insert(4, " Good Morning"));
System.out.println(s.replace(1, 5, "aii"));
System.out.println(s.delete(11,14));
System.out.println(s.reverse());
	}

}
