package lesson8.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Student s1 = new Student("Tim",1234,80);
	  Student s2 = new Student("Amar",1456,90);
	  Student s3 = new Student("Bruck",1111,92);
	  Student s4 = new Student("Carol",1222,81);
	  Student s5 = new Student("James",1212,100);
	  
	  List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
	  
	  // 1. Comparator declared outside
	  IdComparator id = new IdComparator();
	  // To sort you can Collections.sort(list,comparator)
	  Collections.sort(list, id);
	  System.out.println("Sort by Stuent Id using outside Comparator");
	  System.out.println(list);
	  
	  /* 2. Anonymous Implementation for sorting student list using Score
	   Without any class do the direct implementation of Comparator Interface*/
	  Comparator<Student> scom = new Comparator<>() {
		@Override
		public int compare(Student o1, Student o2) {
			return Integer.compare(o2.getScore(), o1.getScore());
		}
		  
	  };
	  Collections.sort(list, scom);
	  System.out.println("Reversed Sort by Stuent Score using Anonymous Implementation" );
	  System.out.println(list);
	  
	  /* 3. Lambda implementation of Comparator using name 
	   * Comparator is a Functional Interface, so you can implement using Lambda
	   * (arguments) -> body*/
	  Collections.sort(list,
			  (o1,o2)-> o1.getName().compareTo(o2.getName())
			  );
	  System.out.println("Sort by Stuent Name using Lambda");
	  System.out.println(list);
	  
	  // 4. Inner class implementation of Comparator - for your practice
	  
	  
	  //5. Comparator consist with equals.
	  
	  Student st1 = new Student("Tim",1234,80);
	  Student st2 = new Student("Tim",1234,80);
	  
	  boolean res = st1.equals(st2); // false
	  IdComparator id1 = new IdComparator();
	  /* return 0 if two objects are equal, 
	   * if return positive value means first object is greater than the second object
	   *  if return negative value means first object is smaller than the second object*/
	  int r = id1.compare(st1, st2); 
	  System.out.println("Boolean result from Equals for comparing st1,st2 " + res );
	  System.out.println("int result from IdComparator for comparing st1,st2 " + r );
	  /* The above comparision is not consist equal. If it consist with equal means
	   * both comparator and equals gives same result. Over here equals determine,
	   *  if all the fields are same return true, but your comparator 
	   *  determine the equality using only id*/
	  
	  ConsistComparator cc = new ConsistComparator(); // Consist with equals
	  r = cc.compare(st1, st2);
	  System.out.println("int result from ConsistComparator for comparing st1,st2 " + r );
	}

}
