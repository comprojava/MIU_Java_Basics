package lesson8.listapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListAPI {

	public static void main(String[] args) {
		// Parameterized type
		List<String> ob = new ArrayList<>(); // Default length is 11
	 
		 ob.add("Java");
		 ob.add("C++");
		 ob.add(1, "HTML");
		 System.out.println(ob);
		 System.out.println(ob.size());
		 System.out.println(ob.contains("C++"));
		 System.out.println(ob.remove(0));
		 
		 // Raw Type - Object - Drawbacks, you have to do down casting of specific type.
		 List list1 = new ArrayList<>();
		 list1.add(new Integer(10));
		 list1.add("Java");
		 int index0 = (int) list1.get(0);
		 ArrayList<String> stringArray = new ArrayList<String>(
				 Arrays.asList("Hello", "Welcome", "Java", "Object", "Array", "String", "Inheritance"));
		 
		 // Sorting 
		 Collections.sort(stringArray);
		 System.out.println("Natural Sorted List :" + stringArray);
		 
		// Collections.sort(stringArray,Collections.reverseOrder());
	//	 System.out.println("Reversed Sorted List :" + stringArray);
		 
		 // Binary Search
		 int pos = Collections.binarySearch(stringArray, "Hello");
		 System.out.println("Position of Key Hello " + pos);
		
		 pos = Collections.binarySearch(stringArray, "HTML");
		 System.out.println("Position of Key HTML " + pos);

		 
		 // ArrayList of Apple - Only specify the type on left side, From Java 7 no need to specify type on Right side
		 List<Apple> alist = new ArrayList<>();
		 alist.add(new Apple());
		 alist.add(new Apple("Green",2.3,1.5));
		 System.out.println(alist);
		 Apple a2 = new Apple("Green",2.3,1.5);
		 Apple a1 = new Apple("Green",2.3,1.5);
		 // To make use of contains for the Apple, you should override equals and hashcode
		 boolean res = alist.contains(a2); 
		 System.out.println("arraylist contains : "+res);
		 res = a1.equals(a2);
		 System.out.println("Apple  equals : "+res);
		 
	}

}
