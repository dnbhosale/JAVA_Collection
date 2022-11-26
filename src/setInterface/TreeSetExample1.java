package setInterface;

import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
	 
		
		TreeSet<String> treeset1=new TreeSet<>();
		treeset1.add("SHAM");
		treeset1.add("SHAMu");
		treeset1.add("RAM");
		treeset1.add("GANU");
		
		System.out.println("treeSet1 :-> "+treeset1);
		
		 TreeSet<Integer> set=new TreeSet<Integer>();    
         set.add(24);    
         set.add(66);    
         set.add(12);    
         set.add(15);    
         System.out.println(set);
         System.out.println("Lowest Value: "+set.pollFirst());    
         System.out.println("Highest Value: "+set.pollLast());    
		

	}

}
