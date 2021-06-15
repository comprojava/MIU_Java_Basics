package lesson8.listapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array1 {
	public static void main(String args[]) {
		ArrayList<String> stringArray = new ArrayList<>(
				Arrays.asList("Hello", "Welcome", "Java", "Object", "Arry", "String", "inheritance", "Swing"));
		System.out.println("**** Unsorted String Array ****");
		System.out.println(stringArray);
		System.out.println();
		System.out.println("**** orted String Array ****");
		// Sorting in ascending order
		Collections.sort(stringArray);
		System.out.println(stringArray);
		// binary search
		int a = Collections.binarySearch(stringArray, "Java");
		System.out.println(a);

		System.out.println("**** sorted String Array in descending order ****");
		// Sorting in descending order
		Collections.sort(stringArray, Collections.reverseOrder());
		System.out.println(stringArray);

	}

}
