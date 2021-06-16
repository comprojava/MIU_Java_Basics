package leet;

public class Palindrome2 {
	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int leftDigit = 0;
		int rightDigit = 0;
		long temp = 1;
		while (x > temp * 10)
			temp *= 10;
		while (x > 0) {
			rightDigit = x % 10;
			leftDigit = x / (int) temp;
			if (leftDigit != rightDigit) {
				System.out.println(leftDigit + " <> " + rightDigit + " in " + x + " when temp: " + temp);
				return false;
			}
			x %= temp;
			x /= 10;
			temp /= 100;
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome(1021));
		System.out.println(isPalindrome(991199));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(1000021));
	}

}
