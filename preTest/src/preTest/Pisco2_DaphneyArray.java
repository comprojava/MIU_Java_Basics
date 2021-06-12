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
		System.out.println("Restarting .....");
	}

}
