package Java_Interview_Frequent_Questions;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_array_using_In_Built_methods {

	public static void main(String[] args) {

		
		
		
//		Logic 1 - to sort in ascending order
//		Arrays.sort(a);  //to sort in ascending order
		int a[]= {3,4,2,1};
		System.out.println("Array before sorting = " + Arrays.toString(a));
		Arrays.parallelSort(a); // to sort in ascending order
		System.out.println("After sorting = " + Arrays.toString(a));
		
//		Logic 2 - to sort in descending order
		Integer b[]= {2,3,4,67,8};  //primitive type is not allowed for collections
		System.out.println("Array before sorting = " + Arrays.toString(b));
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("After sorting in reverse order = " + Arrays.toString(b));

		
//		
	}

}
