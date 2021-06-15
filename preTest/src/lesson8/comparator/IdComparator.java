package lesson8.comparator;

import java.util.Comparator;

// Sort the collecton using id with help of Compaator interface
public class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return Integer.compare(s1.getId(), s2.getId());
	}
	
}
