package preTest;

public class Pisco4_Normal {
	static int isNormal(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0 && i % 2 == 1)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isNormal(1));
		System.out.println(isNormal(2));
		System.out.println(isNormal(3));
		System.out.println(isNormal(4));
		System.out.println(isNormal(5));
		System.out.println(isNormal(6));
		System.out.println(isNormal(7));
		System.out.println(isNormal(8));
		System.out.println(isNormal(9));
		System.out.println(isNormal(10));

	}

}
