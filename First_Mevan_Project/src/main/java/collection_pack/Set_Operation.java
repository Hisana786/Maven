package collection_pack;

import java.util.HashSet;
import java.util.Set;

public class Set_Operation {

	public static void main(String[] args) {
		Set<String> obj = new HashSet<String>();
obj.add("BCA");
obj.add("BCOM");
obj.add("BA");
obj.add("BSC");
System.out.println(obj);

Set<String> obj1 = new HashSet<String>();
obj1.add("Apple");
obj1.add("Orange");
obj1.add("Mango");
obj1.add("Grapes");
System.out.println(obj1);
obj.addAll(obj1);
System.out.println(obj);
obj1.contains(obj);
System.out.println(obj1);
obj.containsAll(obj1);
System.out.println(obj);
System.out.println(obj.isEmpty());
System.out.println(obj.remove("BSC"));
System.out.println(obj);
obj.clear();
System.out.println(obj);
System.out.println(obj.isEmpty());
	}
	

}
