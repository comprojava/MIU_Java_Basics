package leet;

public class Reverse {
	public static int reverse(int x) {
		int reverse = 0;
		while (x != 0) {
			if (reverse * 10 + x % 10 > Integer.MAX_VALUE)
				return 0;
			if (reverse * 10 + x % 10 < Integer.MIN_VALUE)
				return 0;
			reverse *= 10;
			reverse += x % 10;

			x /= 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(reverse(190));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

	}

}
