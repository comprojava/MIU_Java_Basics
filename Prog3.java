package kazi;

import java.util.Arrays;

public class Prog3 {
	static String[] removeDups(String[] a) {
		int k=0;
		int n = a.length;
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			int j;
			for (j = 0; j < i; j++)
				if (a[i].equals(a[j]))
					break;
			if (i == j) {
				s[i] = a[i];
				k++;
			}
		}
		String[] result = new String[k];
		for(int i=0;i<k;i++)
			result[i] = s[i];
		return result;
	}
	public static void main(String args[]) {
		String[] s= {"horse", "dog", "cat", "horse","dog"};
		System.out.println(Arrays.toString(removeDups(s)));
	}
}
