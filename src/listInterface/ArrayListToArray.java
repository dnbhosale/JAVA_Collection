package listInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println("ArrayList print :->"+list);
		
		Integer[] listToArray=list.toArray(new Integer[list.size()]);
		System.out.println("List to Array Form :-> "+Arrays.toString(listToArray));
	}

}
