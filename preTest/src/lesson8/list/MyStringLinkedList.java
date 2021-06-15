package lesson8.list;

public class MyStringLinkedList {
	Node header;
	MyStringLinkedList(){
		header = new Node(null,null, null);
	}
	public void addFirst(String item){
		Node n = new Node(header,item,header.next);
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;
	}
	/** returns the index of the String s, if found; 
	 * -1 otherwise 
	 */
	public int find(String s){
		if(s == null) return -1;
		Node currentNode = header;
		int i = -1;
		while(currentNode.next != null){
			++i;
			currentNode = currentNode.next;
			if(s.equals(currentNode.value)) return i;
		}
		return -1;
	}
	public int size(){
		int count = 0;
		Node next = header.next;
		while(next != null){
			++count;
			next = next.next;
		}
		return count;
	}
	private Node getNode(int pos){
		if (pos >= size() && (pos<0)) throw new IndexOutOfBoundsException();		
		Node next = header;
		for(int i = 0; i <= pos; ++i){
			next = next.next;			
		}
		//next is the node we are seeking
		return next;
	}
	public String get(int pos){
		Node node = getNode(pos);
		return (node != null) ? node.value : null;
	}
	public void insert(String s, int pos) {
		//corrected to throw exception
		if(pos > size() && (pos<0)) {
			throw new IndexOutOfBoundsException("pos = "+pos +" but size = "+size());
		}
		Node next = header;
		Node previous = null;
		for(int i = 0; i <= pos; ++i){
			if(i==pos){
				previous = next;
			}
			next = next.next;
		}
		Node insertNode = new Node(previous,s,next);
		if(next != null){
			next.previous = insertNode;
		}
		previous.next =insertNode;
	}
	public boolean isEmpty() {
		if(header.next == null || size()==0)
			return true;
		else
			return false;
	}
	/** remove object at specified index */
	public boolean remove(int index){
		Node toBeRemoved = getNode(index);
		if(toBeRemoved == null) return false;
		Node previous = toBeRemoved.previous;
		Node next = toBeRemoved.next;
		previous.next = next;
		if(next != null){
			next.previous = previous;
		}
		toBeRemoved = null;
		return true;
	}
	/** remove by specifying object -- removes
	 *  first occurrence of s
	 */
	public boolean remove(String s){
		int pos = find(s);
		if(pos == -1) return false;
		return remove(pos);
		
	}	
	void printNodes() {
		Node next = header.next;
		if(next == null) System.out.println("");
		else {
			String s= next.toString();
			System.out.println(s);
		}
	}
	class Node {
		Node previous;
		String value;
		Node next;
		
		Node(Node previous, String value, Node next){
			this.previous = previous;
			this.value = value;
			this.next = next;
		}
		@Override
		public String toString() {
		    if(value == null) return "";
			StringBuilder sb = new StringBuilder(value + " ");
			sb = toString(sb, next);
			return sb.toString();
		}
		private StringBuilder toString(StringBuilder sb, Node n) {
			if(n == null) return sb;
			sb.append(n.value + " ");
			return toString(sb, n.next);
		}
	}
	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		System.out.println("Is Empty : "+list.isEmpty());
		list.addFirst("Java");
		list.addFirst("C#");
		list.insert("Android", 0);
		list.printNodes();
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.find("Java"));
		System.out.println(list.remove(1));
		list.printNodes();
		System.out.println(list.size());
		System.out.println("Is Empty : "+list.isEmpty());
	}
}

