package lesson8.list;

public class MyStringLinkedList {

	Node header;

	public MyStringLinkedList() {
		header = new Node(null, null, null);
	}

	public void addFirst(String item) {
		Node newNode = new Node(header, item, header.next);
		if (header.next != null)
			header.next.previous = newNode;
		header.next = newNode;
	}

	int find(String s) {
		if (s == null)
			return -1;
		Node current = header;
		int index = -1;
		while (current.next != null) {
			index++;
			current = current.next;
			if (s.equals(current.value))
				return index;
		}
		return -1;
	}

	// mine ---> not working
	public void addLast(String item) {
		Node current = header;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node(current, item, null);
		current.next = newNode;
	}

//	/** returns the index of the String s, if found; 
//	 * -1 otherwise 
//	 */
//	public int find(String s){
//		if(s == null) return -1;
//		Node currentNode = header;
//		int i = -1;
//		while(currentNode.next != null){
//			++i;
//			currentNode = currentNode.next;
//			if(s.equals(currentNode.value)) return i;
//		}
//		return -1;
//	}

	public int size() {
		int count = 0;
		Node next = header.next;
		while (next != null) {
			++count;
			next = next.next;
		}
		return count;
	}

	private Node getNode(int pos) {
		if (pos >= size() || (pos < 0))
			throw new IndexOutOfBoundsException("out of range");
		Node next = header;
		for (int i = 0; i <= pos; ++i) {
			next = next.next;
		}
		// next is the node we are seeking
		return next;
	}

	public String get(int pos) {
		Node node = getNode(pos);
		return (node != null) ? node.value : null;
	}

	public void insert(String item, int index) {
		if (index >= size() || index < 0)
			throw new IllegalArgumentException("index should be in range: [0 ," + (size() - 1 + "]"));
		if (item == null)
			return;

		Node current = header;
		int i = -1;
		while (current.next != null) {
			i++;
			current = current.next;
			if (i == index) {
				Node node = new Node(current.previous, item, current);
				current.previous.next = node;
				current.previous = node;
				break;
			}

		}
	}

//	public void insert(String s, int pos) {
//		//corrected to throw exception
//		if(pos > size() && (pos<0)) {
//			throw new IndexOutOfBoundsException("pos = "+pos +" but size = "+size());
//		}
//		Node next = header;
//		Node previous = null;
//		for(int i = 0; i <= pos; ++i){
//			if(i==pos){
//				previous = next;
//			}
//			next = next.next;
//		}
//		Node insertNode = new Node(previous,s,next);
//		if(next != null){
//			next.previous = insertNode;
//		}
//		previous.next =insertNode;
//	}
	public boolean isEmpty() {
		if (header.next == null || size() == 0)
			return true;
		else
			return false;
	}

	public boolean remove(int index) {
		if (isEmpty())
			throw new IllegalArgumentException("List is empty");
		if(index>=size()||index<0)
			throw new IllegalArgumentException("index is out of range");
		int i=-1;
		Node current = header;
		while(current.next!=null) {
			i++;
			current = current.next;
			if(i==index) {
				current.previous.next = current.next;
			}
			
		}
		return false;
	}

//	/** remove object at specified index */
//	public boolean remove(int index){
//		Node toBeRemoved = getNode(index);
//		if(toBeRemoved == null) return false;
//		Node previous = toBeRemoved.previous;
//		Node next = toBeRemoved.next;
//		previous.next = next;
//		if(next != null){
//			next.previous = previous;
//		}
//		toBeRemoved = null;
//		return true;
//	}
//	/** remove by specifying object -- removes
//	 *  first occurrence of s
//	 */
//	public boolean remove(String s){
//		int pos = find(s);
//		if(pos == -1) return false;
//		return remove(pos);
//		
//	}	
	void printNodes() {
		Node next = header.next;
		if (next == null)
			System.out.println("");
		else {
			String s = next.toString();
			System.out.println(s);
		}
	}
	// or

	void displayNodes() {
		Node current = header.next;
		while (current != null) {
			if (current.next == null)
				System.out.println(current.value);
			else
				System.out.print(current.value + " -->");
			current = current.next;
		}
	}

	class Node {
		Node previous;
		String value;
		Node next;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		@Override
		public String toString() {
			if (value == null)
				return "";
			StringBuilder sb = new StringBuilder(value + " ");
			sb = toString(sb, next);
			return sb.toString();
		}

		private StringBuilder toString(StringBuilder sb, Node n) {
			if (n == null)
				return sb;
			sb.append(n.value + " ");
			return toString(sb, n.next);
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		System.out.println("Is Empty : " + list.isEmpty());

		list.addFirst("Java");
		list.addFirst("Math");
		list.addFirst("C#");
		list.addLast("Pascal");
		list.addLast("Kibonge");
		System.out.println("before insert");
		list.displayNodes();
		list.insert("Algo", 1);
		System.out.println("After inserting algo at 1");
		list.displayNodes();
		int k = list.find("Pascal");
		System.out.println(k);
//		list.addFirst("C#");
//		list.insert("Android", 0);
//		list.printNodes();
//		System.out.println(list.size());
//		System.out.println(list.get(0));
//		System.out.println(list.find("Java"));
//		System.out.println(list.remove(1));
		// list.printNodes();

		System.out.println("Size = " + list.size());
//		System.out.println(list.size());
//		System.out.println("Is Empty : "+list.isEmpty());
	}
}
