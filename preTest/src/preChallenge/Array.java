package preChallenge;

public class Array {
	private int count;
	int[] items;

	public Array(int length) {
		items = new int[length];
	}
	// --------------------------

	public void resizeIfRequired() {
		if (items.length == count) {
			int[] temp = new int[count * 2];
			for (int i = 0; i < count; i++) {
				temp[i] = items[i];
			}
			items = temp;
		}
	}
	//// Note that I've extracted the logic for
	// resizing the array into this private
	// method so we can reuse in insert() and
	// insertAt() methods.
	//
	// This also made our code cleaner and
	// more readable.
	// ----------------------------------------------

	// 1 insert last
	public void insert(int item) {
		resizeIfRequired();
		items[count++] = item;
	}

	// 2 insert at
	public void insertAt(int index, int item) {
		if (index < 0 || index >= count)
			throw new IllegalArgumentException("Out of range!!!");

		resizeIfRequired();

		for (int i = count - 1; i >= index; i--) {
			items[i + 1] = items[i];
		}
		items[index] = item;
		count++;
	}

	// 3 reversing
	public void reverse() {
		int[] temp = new int[count];
		for (int i = 0; i < count; i++) {
			temp[i] = items[count - 1 - i];
		}
		items = temp;
	}

	public void removeLast() {
		items[--count] = 0;
	}

	public void removeAt(int index) {
		if (index < 0 || index >= count)
			throw new IllegalArgumentException("Out of range!!!");
		for (int i = index; i < count; i++)
			items[i] = items[i + 1];
		count--;
	}

	public int indexOf(int item) {
		for (int i = 0; i < count; i++) {
			if (items[i] == item)
				return i;
		}
		return -1;
	}

	/////////////////////////////////////////////////// exercises//////////////////
	public int max() {
		// O(n): Because we have to iterate over
		// the entire array to find the largest
		// number. This number may be at the end
		// of the array (worst case scenario).
		int max = items[0];
		for (int i = 1; i < count; i++)
			if (items[i] > max)
				max = items[i];
		return max;
	}

	public Array intersect(Array other) {
		Array inter = new Array(count);
		for (int item : items) {
			if (other.indexOf(item) >= 0)
				inter.insert(item);
		}
		return inter;
	}

	public int[] intersect1(int[] items2) {
		int n = items2.length;
		int[] inter1 = new int[n < count ? n : count];
		int k = 0;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < n; j++) {
				if (items[i] == items2[j]) {
					inter1[k] = items[i];
					k++;
					break;
				}
			}
		}
		int[] inter = new int[k];
		for (int i = 0; i < k; i++) {
			inter[i] = inter1[i];
		}
		return inter;
	}

	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.print(items[i] + ", ");
		}
	}
}
