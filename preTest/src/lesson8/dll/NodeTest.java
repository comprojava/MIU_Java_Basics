package lesson8.dll;

public class NodeTest {
	public void addFirst(int item) {
		if
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node p1 = new Node(null, 0, null);
		Node p2 = new Node(p1, 100, null);
		p1.next = p2;
		Node m = new Node(p1, 60, p2);
		p1.next = m;
		p2.prev = m;
		for(Node p=p1.next;p!=null;p=p.next)
			System.out.println(p);
		System.out.println("-------------");
		System.out.println(p2.prev);
	}
}
