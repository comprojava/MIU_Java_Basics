package preTest;

public class Pisco5_AllPossibilities {
	static int isAllPossibilities(int[] a) {
		if (a == null || a.length == 0)
			return 0;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] < 0 || a[i] >= n)
				return 0;
			for (int j = i + 1; j < n; j++)
				if (a[i] == a[j])
					return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1, 2, 0, 3};
		int[] a1={3, 2, 1, 0};
		int[] a2={1, 2, 4, 3} ;
		int[] a3={0, 2, 3};
		int[] a4={0};
		int[] a5={1};
		int[] a6={};
		System.out.println(isAllPossibilities(a));
		System.out.println(isAllPossibilities(a1));
		System.out.println(isAllPossibilities(a2));
		System.out.println(isAllPossibilities(a3));
		System.out.println(isAllPossibilities(a4));
		System.out.println(isAllPossibilities(a5));
		System.out.println(isAllPossibilities(a6));

	}

}
