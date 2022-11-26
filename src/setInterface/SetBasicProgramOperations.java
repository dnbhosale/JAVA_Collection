package setInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetBasicProgramOperations {

	public static void main(String[] args) {

		// Create two array
		Integer[] array1 = { 1, 2, 3, 4, 5, 65, 8 };
		Integer[] array2 = { 34, 43, 43, 1, 2, 3, 4, 4 };

		// create two set
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		// passing array's value into set

		set1.addAll(Arrays.asList(array1));
		set2.addAll(Arrays.asList(array2));
		System.out.println("set1:->" + set1);
		System.out.println("set2:->" + set2);

		// finding union of two sets

		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("union:-> " + union);

		// finding intersection of two set

		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("intersection:-> " + intersection);

		// finding difference of two sets

		Set<Integer> difference = new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println("difference:-> " + difference);

	}

}
