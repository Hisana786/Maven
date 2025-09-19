package collection_pack;

import java.util.ArrayList;
import java.util.List;

public class Collection_List {

	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		System.out.println(obj);
		//add = add method in the collection. 
		//set = set a new element in the collection it replace current element to new element. 
		//indexOf() = return index of the element.
		// duplication element should print first element.
		//lastindexOf() = show last occurance
		//contains = to check that is present
		//isEmpty = to check whether collection is empty
		obj.add("Red");
		obj.add("Yellow");
		obj.add("Black");
		obj.add("Red");
		System.out.println(obj);
		obj.set(1, "Violet");
		System.out.println(obj);
		System.out.println(obj.indexOf("Black"));
		System.out.println(obj.indexOf("Red"));
		System.out.println(obj.lastIndexOf("Red"));
		System.out.println(obj.contains("Violet"));
		System.out.println(obj.contains("blue"));
		System.out.println(obj.isEmpty());
	}
}
