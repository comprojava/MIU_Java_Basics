package lesson8.comparator;

import java.util.Comparator;

public class ConsistComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(Integer.compare(o1.getId(), o2.getId())!=0)
		return Integer.compare(o1.getId(), o2.getId());
		else
		{
			if(Integer.compare(o1.getScore(), o2.getScore())!=0)
				return Integer.compare(o1.getScore(), o2.getScore());
		}
		return o1.getName().compareTo(o2.getName());
	}

}
