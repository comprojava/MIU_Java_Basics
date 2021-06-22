package basic;

import java.util.Scanner;

public class Merge2Arrays {
	Scanner input = new Scanner(System.in);
	int[] create(int size) {
		
		int[] newArray = new int[size];
		System.out.println("Entering elements of an array:");
		for (int i = 0; i < size; i++)
			newArray[i] = input.nextInt();
		//input.close();
		return newArray;
	}

	void displayArray(int[] a) {
		System.out.print("[");
		for (int item : a)
			System.out.print(item + " ");
		System.out.println("]");
	}

	void sortArray(int[] a) {
		int n = a.length;
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	int[] merged(int[] a, int[] b) {
		int x = a.length;
		int y = b.length;
		int n = x + y;
		int[] arr = new int[n];
		int i, j, k;
		i = j = k = 0;
		for (i = 0; i < n; i++) {
			if (a[j] < b[k]) {
				arr[i] = a[j];
				j++;
				if (j >= x) {
					for (i++; k < y; i++, k++) {
						arr[i] = b[k];
					}
				}
			} else {
				arr[i] = b[k];
				k++;
				if(k>=y) {
					for(i++;j<x;i++, j++) {
						arr[i]=a[j];
					}
				}
			}
		}
		return arr;

	}

	public static void main(String args[]) {
		Merge2Arrays merge = new Merge2Arrays();
		System.out.println("Creating a !!!");
		int[] a = merge.create(3);
		System.out.println("Creating b !!!");
		int[] b = merge.create(5);
		merge.displayArray(a);
		merge.displayArray(b);
		merge.sortArray(a);
		merge.sortArray(b);
		System.out.println("after sorting: ");
		merge.displayArray(a);
		merge.displayArray(b);
		merge.displayArray(merge.merged(a, b));
	}
}
