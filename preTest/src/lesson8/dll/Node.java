package lesson8.dll;

public class Node {
	Node prev;
	int data;
	Node next;
	
	
	public Node(Node prev, int data, Node next) {
		this.prev = prev;
		this.data = data;
		this.next = next;
	}


	public String toString() {
		return data+" ";
	}

}
