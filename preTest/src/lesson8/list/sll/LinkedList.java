package lesson8.list.sll;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {
	// instance fields
	private Node first;
	private Node last;
	private int size;

	// inner class
	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	public void addFirst(int item) {
		Node newNode = new Node(item);
		if (isEmpty()) {
			first = last = newNode;
		}
		newNode.next = first;
		first = newNode;
		size++;
	}

	public void addLast(int item) {
		var newNode = new Node(item);
		if (isEmpty())
			first = last = newNode;
		last.next = newNode;
		last = newNode;
		size++;
	}

	public void removeFirst() {
		if (isEmpty())
			throw new NoSuchElementException();
		if (first == last) {
			first = last = null;
			return;
		}
		Node temp = first.next;
		first.next = null;
		first = temp;
		size--;

		// first = first.next;
	}

	public void removeLast() {
		if (isEmpty())
			throw new NoSuchElementException();
		if (first == last) {
			first = last = null;
			return;
		} else {
			Node current = first;
			while (current.next != last) {
				current = current.next;
			}
			Node temp = current;
			current.next = null;
			last = temp;
		}
		size--;
	}

	public boolean contains(int item) {
//		if(isEmpty())return false;
//		Node current = first;
//		while(current!=null) {
//			if(current.value==item)
//				return true;
//			current = current.next;
//		}
//		return false;

		// or
		return indexOf(item) != -1;
	}

	public int indexOf(int item) {
		int index = 0;
		Node current = first;
		while (current != null) {
			if (item == current.value)
				return index;
			current = current.next;
			index++;

		}
		return -1;

	}

	public int size() {
		/*
		 * if(first==null)return 0; else { Node current= first; int size=0;
		 * while(current!=null) { size++; current= current.next; } return size; }
		 */
		// O(n) Not recommended
		// or

		return size; // O(1) -> the recommended approach

	}

	public int[] toArray() {
		int[] result = new int[size];
		Node current = first;
		for (int i = 0; i < size; i++) {
			result[i] = current.value;
			current = current.next;
		}
		return result;
	}

//	public LinkedList reversed(LinkedList list) {
//		LinkedList result = new LinkedList();
//		if (first == null || first == last)
//			return list;
//		Node current = first;
//		while(current!=null) {
//			result.addFirst(current.value);
//			current = current.next;
//		}
//		return result;
//	}

	// or ->
	public void reverse() { // recommended
		if (first == null)
			return;
		Node previous = first;
		Node current = first.next;
		Node temp;
		while (current != null) {
			temp = current.next;
			// reverse the connection
			current.next = previous;

			// move one step forward
			previous = current;
			current = temp;
		}

		// reassign first and last Nodes in the reversed linkedlist
		last = first;
		last.next = null;
		first = previous;
	}

	public int getItem(int index) {
		if (index >= size || index < 0)
			throw new IllegalArgumentException("Out of range");
		Node current = first;
		int i = 0;
		while (i != index) {
			current = current.next;
			i++;
		}
		return current.value;
	}

//	public int kthItem(int k) {
//		return getItem(size()-k);
//	}
//Or
	public int getKth(int k) { // mine
		// if(k>size() || k<1)throw new
		Node current = first;
		int i = 0;
		while (i != size() - k) {
			current = current.next;
			i++;
		}

		return current.value;
	}

	// or ->the recommended from mosh
	// Find the kth node from the end of a linked list in one pass
	public int getKthFromTheEnd(int k) {
		if (isEmpty())
			throw new IllegalStateException();
		Node a, b;
		a = b = first;
		int i = 0;
		while (i < k - 1) {
			i++;
			b = b.next;
			if (b == null)
				throw new IllegalArgumentException("k is greater");
		}
		while (b != last) {

			a = a.next;
			b = b.next;
		}
		return a.value;
	}

	public void printMiddle() {
		if (first == null)
			return;
		Node mid = first;
		Node end = first;
		int i = 0;
		while (end != last) {
			i++;
			end = end.next;
			if (i % 2 == 0)
				mid = mid.next;
		}
		if (i % 2 == 0)
			System.out.print(mid.value);
		else
			System.out.println(mid.value + " " + mid.next.value);
			
	}

	private boolean isEmpty() {
		return first == null;
	}

	public void display() {
		for (Node n = first; n != null; n = n.next) {
			// System.out.println("n");
			System.out.print(n.value + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var list = new LinkedList();
		list.addLast(12);
		list.addLast(20);
		list.addLast(50);
		list.addFirst(9);
		list.addLast(30);
		list.addLast(100);
		list.addLast(23);
		list.addLast(46);
		// list.display();

		System.out.println("converted to array :" + Arrays.toString(list.toArray()));
		list.printMiddle();
		// System.out.println(list.getItem(0));
		// System.out.println(list.getKthFromTheEnd(6));
		// System.out.println(list.getKthFromTheEnd(1));
		System.out.println();
		// System.out.println("reversed:
		// "+Arrays.toString(list.reversed(list).toArray()));
//		list.reverse();
//		System.err.println("reverse converted to array :" + Arrays.toString(list.toArray()));
//		System.out.println(list.indexOf(9));
//		list.removeFirst();
//		System.out.println(list.indexOf(9));
//		System.out.println(list.indexOf(12));
//		System.out.println(list.contains(0));
//		list.removeLast();
//		System.out.println(list.contains(50));
//		System.out.println("converted to array :" + Arrays.toString(list.toArray()));
//
//		System.out.println("end");

	}

}
