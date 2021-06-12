package preTest;

public class Pisco2_DaphneyArray {
	static int isDaphney(int[] a) {
		if (a == null || a.length == 0)
			return 0;
		int n = a.length;
		boolean evenFlag = false;
		boolean oddFlag = false;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0)
				evenFlag = true;
			else
				oddFlag = true;
			if (evenFlag && oddFlag)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 4, 2};// is a daphney
		int[] b = {1, 3, 17, -5};// is a daphney
		int[] c = {3, 2, 5};// is  not a daphney
		System.out.println(isDaphney(a));
		System.out.println(isDaphney(b));
		System.out.println(isDaphney(c));
	}

}
