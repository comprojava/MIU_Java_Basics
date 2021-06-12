package preTest;

public class Pisco3_OddValent {
	static int isOddValent(int[] a) {
		if (a == null || a.length == 0)
			return 0;
		int n = a.length;
		boolean oddFlag = false;
		boolean moreFlag = false;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 1)
				oddFlag = true;
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					moreFlag = true;
					break;
				}
			}
			if (oddFlag && moreFlag)
				return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] a = { 9, 3, 4, 9, 1 };
		int[] b = { 3, 3, 3, 3 };
		int[] c = { 8, 8, 8, 4, 4, 7, 2 };
		int[] d = { 1, 2, 3, 4, 5 };
		int[] e = { 2, 2, 2, 4, 4 };
		System.out.println(isOddValent(a));
		System.out.println(isOddValent(b));
		System.out.println(isOddValent(c));
		System.out.println(isOddValent(d));
		System.out.println(isOddValent(e));

	}

}
