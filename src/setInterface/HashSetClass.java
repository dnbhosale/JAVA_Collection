package setInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {

// Hashing + Unique e + Null Allow + n synch + N Insertion order + Best-Search

 HashSet<String> hashSet1=new HashSet<String>();
 hashSet1.add("RAM");
 hashSet1.add("SHAM");
 hashSet1.add("SHAM");
 hashSet1.add(null);
 hashSet1.add(null);
 Iterator<String> itr=hashSet1.iterator();
 System.out.print("HashSet Elements :-");
 while(itr.hasNext())System.out.print(" - "+itr.next());
 
		
		
	}

}
