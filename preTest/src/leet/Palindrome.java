package leet;

public class Palindrome {
	public static boolean isPalindrome(int x) {
		if (x < 0)          //1
			return false;   //1
		int frontDigit = 0;  //1
		int backDigit = 0; //1
		long decMeter = 1; //1
		int temp = x; //1

		while (temp >= decMeter *10) { //11
			decMeter *= 10;
		}

		while (temp > 0) {  //11
			frontDigit = temp / (int)decMeter;
			backDigit = temp % 10;
			if (frontDigit != backDigit)
				return false;
			temp%=decMeter;
			temp/=10;
			
			decMeter/=100;
		}
		return true;
	} //O(1)

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(991199));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(1000021));
	}

}
