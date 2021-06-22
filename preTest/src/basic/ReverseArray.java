package basic;

import java.util.Arrays;

public class ReverseArray {
	static int[] reverseArray(int[] a) {
		int n= a.length;
		int[] reversed=new int[n];
		for(int i=0, j=n-1;i<n;i++, j--) {
			reversed[i]=a[j];
		}
		return reversed;
	}
	public static void main(String[] args) {
		int[] a= {1,2,4,5,0};
		int[] b= {5};
		int[] c= {300,59};
		System.out.println(Arrays.toString(a)+"->"+Arrays.toString(reverseArray(a)));
		System.out.println(Arrays.toString(b)+"->"+Arrays.toString(reverseArray(b)));
		System.out.println(Arrays.toString(c)+"->"+Arrays.toString(reverseArray(c)));
	}
}
