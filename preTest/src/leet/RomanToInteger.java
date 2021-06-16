package leet;

public class RomanToInteger {
	public static int romanToInt(String s) {
		int result = 0;
		int n = s.length();
		int store = 0;
		for (int i = 0; i < n; i++) {
			int value = 0;
			if (s.charAt(i) == 'I')
				value = 1;
			if (s.charAt(i) == 'V')
				value = 5;
			if (s.charAt(i) == 'X')
				value = 10;
			if (s.charAt(i) == 'L')
				value = 50;
			if (s.charAt(i) == 'C')
				value = 100;
			if (s.charAt(i) == 'D')
				value = 500;
			if (s.charAt(i) == 'M')
				value = 1000;

			if (value > store) {
				value -= store;
				result -= store;
			}
			store = value;
			result += value;
		}
		return result;

	}

	public static void main(String args[]) {
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("VI"));
		System.out.println(romanToInt("CCLII"));// 252
		System.out.println(romanToInt("CDXIV"));// 414
		System.out.println(romanToInt("CCXLVIII"));// 248
		System.out.println(romanToInt("CCLXVII"));// 267
	}
}
