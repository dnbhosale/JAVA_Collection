package mapInterface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapPlayWithJAVA8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(100,"RAm");
		map.put(101, "ShamRao");
		map.put(null, null);
		map.put(null, null);
		map.put(121, "Prem");
		System.out.println("Simple map Iterate :-> "+map);
		
		//Iterating the map by using the java Stream Interface
		
     map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).
     forEach(System.out::println);
		
		
		

	}

}
