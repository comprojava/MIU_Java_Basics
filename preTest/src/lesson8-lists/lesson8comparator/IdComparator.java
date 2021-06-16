package lesson8.comparator;

import java.util.Comparator;

// Sort the collecton using id with help of Compaator interface
public class IdComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}

}
