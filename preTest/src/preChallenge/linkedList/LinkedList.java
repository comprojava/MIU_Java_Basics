package preChallenge.linkedList;

public class LinkedList {
	private class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;
		}
	}

	private Node first;
	private Node last;

//addFirst

//addLast
	public void addLast(int item) {
		var node = new Node(item);
		if (first == null)
			first = last = node;
		else {
			last.next = node;
			last = node;
		}
	}

	public void print() {
		System.out.println();
	}
//deletFirst
//deleteLast
//contains
//indexOf

}
