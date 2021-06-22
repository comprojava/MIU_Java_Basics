package lesson8.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LLAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> arrl=new LinkedList<>();
		arrl.add("java");
		arrl.add("vb");
		arrl.add("c");
		arrl.add("c++");
		arrl.add("Valid");
		System.out.println(arrl);
		System.out.println();
		Iterator<String> it= arrl.iterator();
		while(it.hasNext()) {
			String item = it.next();
			if(item.startsWith("V"))
				System.out.println(item);
		}
		

	}

}
