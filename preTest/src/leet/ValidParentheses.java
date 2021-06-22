package leet;

import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
		int n = s.length();
		char c;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			c = s.charAt(i);
			if (c == '{' || c == '[' || c == '(')
				stack.push(c);
			else if (c == '}' || c == ']' || c == ')') {
				if (stack.isEmpty())
					return false;
				if ((c == '}' && stack.pop() == '{') || (c == ']' && stack.pop() == '[')
						|| (c == ')' && stack.pop() == '('))
					;
				else
					return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String str = "([])";
		System.out.println(isValid(str));
		;

	}

}
