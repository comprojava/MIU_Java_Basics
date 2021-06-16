package lesson8.listapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GnericRestriction {

	public static void main(String[] args) {
		// Restriction 1
	//	List<String>[] arrayOfLists = new ArrayList<String>[10]; 
		List<List<String>> lists = new ArrayList<>();
		List<String> l1 = new ArrayList<>(Arrays.asList("Java","C++"));
		List<String> l2 = new ArrayList<>(Arrays.asList("FPP","MPP"));
		
		lists.add(l1);
		lists.add(l2);
		System.out.println(lists);
		List<String> fl = lists.get(0);
		System.out.println(fl);
		
		// Java 10 var 
		var ob = new ArrayList<Integer>();
		ob.add(10);
		ob.add(20);
		var x = 10; // automatically take type from the input
		

	}

}
