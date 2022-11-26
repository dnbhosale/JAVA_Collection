package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1,"RAM");
		map.put(2,"SHAM");
		map.put(3,"GANESH");
		map.put(4,"AMIT");
		map.put(5,"SHARAD");
		
		System.out.println("map travers directly :-> "+map);
		//convert map into set so traver it
		Set set=map.entrySet();
		
		Iterator itr=set.iterator();
		System.out.println("Iterating the data by Iterator throught the set");
		System.out.println("Key |  Value");
		System.out.println("-------------");
		while(itr.hasNext()) {
		    Map.Entry entry=(Map.Entry)itr.next();  
			System.out.println(entry.getKey()+"|      |"+entry.getValue());
		}
		
		System.out.println("\n\nAccessing the map elements by using the for");
		for(Map.Entry temp: map.entrySet()) {
			System.out.println(temp.getKey()+":->"+temp.getValue());
		}
			
		}
}
