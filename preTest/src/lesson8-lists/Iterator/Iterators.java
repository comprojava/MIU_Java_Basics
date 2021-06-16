package lesson8.listapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple> alist = new ArrayList<>();
		 alist.add(new Apple());
		 alist.add(new Apple("Green",2.3,1.5));
		 alist.add(new Apple("Yellow",2.5,1.2));
		 alist.add(new Apple("Gold",1.5,2.2));
		 alist.add(new Apple("Gold",1.5,2.7));
		 System.out.println(alist);
		 // Task : Print the list of Apples which starts with "G"
		 // Regular index based approach
		 System.out.println("1. Index based approach");
		 for(int i=0;i<alist.size();i++) {
			 Apple ap = alist.get(i);
			 if(ap.getColor().startsWith("G"))
				 System.out.println(ap.getColor());
		 }

		 System.out.println("2. for each approach");
		 for(Apple ob:alist) {
			 if(ob.getColor().startsWith("G"))
				 System.out.println(ob.getColor());
		 }
		 
		 System.out.println("3. Iterator approach");
		 Iterator<Apple> it = alist.iterator();
		 while(it.hasNext()) {
			 Apple ob = it.next();
			 if(ob.getColor().startsWith("G"))
				 System.out.println(ob.getColor());
		 }
		 
		 System.out.println("4. For each using lambda approach");
		 alist.forEach(x-> {
			 if(x.getColor().startsWith("G"))
				 System.out.println(x.getColor());
		 });
		 
		 // Print the list using for each consumer lambda implementation
		 alist.forEach(x->System.out.println(x));
	}

}
