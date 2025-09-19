package string_example;

public class String_Progaram {

	public static void main(String[] args) {
		String s="pathu";
		String d=new String("Fathima");
System.out.println(s);	
		System.out.println(d);
		System.out.println(s.length());
		//length method to find the length of the string
//concat is used to add new characters into the strings
		//to UpperCase to convert to capital letters
		//to LowerCase to convert to small letters
		//is empty to check whether the value is empty or not, if the value is empty it return the boolean value true
		// contains to used to check whether a character is present in a sentence
		//equals to check two string method is equal
		//equalIgnoreCase to ignore cases in the characters or string
		//valueOf convert any datatype to string 
		System.out.println(s.concat(" Hisana"));
		System.out.println(s.concat(d));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		String r="";
		System.out.println(r.isEmpty());
		String c="The value is zero";
		System.out.println(c.contains("zero"));
		System.out.println(c.contains("wow"));
		System.out.println(s.contains("Hisana"));
		String w="java";
		String m="java";
		String n="Java";
		String u="Selenium";
		System.out.println(w.equals(m));
		System.out.println(m.equals(n));
		System.out.println(n.equals(u));
		System.out.println(m.equalsIgnoreCase(m));
		String f=new String("java");
		System.out.println(m.equals(f));
		System.out.println(m==f);
		int h=5;
		System.out.println(String.valueOf(h));
		System.out.println(s.charAt(3));
	}

}
