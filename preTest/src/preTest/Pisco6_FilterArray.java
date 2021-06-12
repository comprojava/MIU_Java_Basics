package preTest;

public class Pisco6_FilterArray {
	static int isFilter(int[] a) {
		boolean filterFlag = true;
		boolean flag9 = false;
		boolean flag7 = false;
		boolean flag11 = false;
		boolean flag13 = false;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] == 7)
				flag7 = true;
			if (a[i] == 9)
				flag9 = true;
			if (a[i] == 11)
				flag11 = true;
			if (a[i] == 13)
				flag13 = true;
		}
		//condition a
		if(flag9)
			if(!flag11)
				return 0;
		//condition b
		if(flag7)
			if(flag13)
				return 0;
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1, 2, 3, 9, 6, 11} ;
		int[] a1={3, 4, 6, 7, 14, 16};
		int[] a2={1, 2, 3, 4, 10, 11, 13}  ;
		int[] a3={3, 6, 5, 5, 13, 6, 13};
		int[] a4={9, 6, 18};
		int[] a5={4, 7, 13} ;
		int[] a6={};
		System.out.println(isFilter(a));
		System.out.println(isFilter(a1));
		System.out.println(isFilter(a2));
		System.out.println(isFilter(a3));
		System.out.println("-------------");
		System.out.println(isFilter(a4));
		System.out.println(isFilter(a5));
		System.out.println(isFilter(a6));
	}

}
