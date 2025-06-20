package String_Java_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Find_DuplicateStringin_Array {

	public static void main(String[] args) {
		String[] Array1 = {"One", "two", "three", "four", "five"};
		String[] Array2 = {"five", "three", "eight"};
		
		for(int i=0;i<Array1.length;i++)
		{
			for(int j=0;j<Array2.length;j++)
			{
				if(Array1[i].equals(Array2[j]))
				{
					System.out.println(Array1[i]);
				}
			}
		}
		
		

//      Logic 2 :
//		        String[] Array3 = {"One", "two", "three", "four", "five"};
//		        String[] Array4 = {"five", "three", "eight"};
//		        // Use a HashSet to store elements of Array1
//		        Set<String> set1 = new HashSet<>(Arrays.asList(Array3));
//		        // Use another HashSet to store duplicates
//		        Set<String> duplicates = new HashSet<>();
//		        // Check which elements from Array2 are also in set1
//		        for (String item : Array4) {
//		            if (set1.contains(item)) {
//		                duplicates.add(item);
//		            }
//		        }
//		        // Print duplicate elements
//		        System.out.println("Duplicate elements in both arrays: " + duplicates);
		    
		}


	}


