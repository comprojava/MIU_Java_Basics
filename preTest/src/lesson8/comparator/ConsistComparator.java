package lesson8.comparator;

import java.util.Comparator;

public class ConsistComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (Integer.compare(s1.getId(), s2.getId()) != 0)
			return Integer.compare(s1.getId(), s2.getId());

		else if (Integer.compare(s1.getScore(), s2.getScore()) != 0)
			return Integer.compare(s1.getScore(), s2.getScore());
		else
			return s1.getName().compareTo(s2.getName());
	}

}
