package preChallenge;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array numbers = new Array(3);
		numbers.insert(10);
		numbers.insert(100);
		numbers.insert(25);
		numbers.insert(50);
		numbers.insert(300);
		numbers.insert(100);
		numbers.print();
		System.out.println();
		numbers.insertAt(1, 57);
		System.out.println("after inserting 57");
		numbers.print();
		System.out.println();
		numbers.reverse();
		System.out.println();
		System.out.println("after reverse");
		numbers.print();
		System.out.println();
		int[] a = { 20, 45, 78, 20, 200, 100, 24 };
		int[] b = numbers.intersect1(a);
		Array c = numbers.intersect(new Array(7)); 
		System.out.println(Arrays.toString(a));
		System.out.println("intersection: " + Arrays.toString(b));
		//System.err.println(Arrays.toString(numbers));
	}
}
