package preChallenge;


public class Array {
	private int count;
	int[] items;
	public Array(int length) {
			items = new int[length];
	}

	public boolean isEmpty() {
		return count==0;
	} 
	public void resize() {
		int[] temp=new int[items.length*2];
		for(int i=0;i<count;i++) {
			temp[i]=items[i];
		}
		items=temp;
	}
	public void insert(int n) {
		if(count==items.length) {
			resize();
		}
		items[count++]=n;
	}
	public void removeLast() {
		items[--count]=0;
	}
	public void removeAt(int index) {
		if(index>=count)
			throw new ArrayIndexOutOfBoundsException("Out of range!!!");
		
	}
	public int indexOf(int item) {
		for(int i=0;i<count;i++) {
			if(items[i]==item)return i;
		}
		return -1;
	}
	public void print() {
		for(int i=0;i<count;i++) {
			System.out.println(items[i]);
		}
	}
}
