package setInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {

	public static void main(String[] args) {
//  maintain insertion order + unique
		
		LinkedHashSet<String> nameColl=new LinkedHashSet<>();
		
		nameColl.add(null);
		nameColl.add("SHAM");
		nameColl.add("RAM");
		nameColl.add("Ganesh");
		
		System.out.println("Name list :-> "+nameColl);
		
    Iterator<String> itr=nameColl.iterator();
    System.out.print("iteration :->");
    while(itr.hasNext())
    	System.out.print(" - "+itr.next());
		
		

	}

}
