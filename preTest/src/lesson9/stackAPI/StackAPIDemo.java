package lesson9.stackAPI;

import java.util.Stack;

public class StackAPIDemo {
	public static void main(String args[]) {
		Stack<Integer> myStack = new Stack<Integer>();
		System.out.println("integer stack");
		System.out.println("----------");
		System.out.println();
		myStack.push(10);
		myStack.push(23);
		myStack.push(40);
		myStack.push(93);
		myStack.pop();
		myStack.push(190);
		myStack.push(30);
		System.out.println(myStack);
		System.out.println(myStack.search(190));
	}

}
