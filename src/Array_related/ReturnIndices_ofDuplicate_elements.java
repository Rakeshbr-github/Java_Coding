package Array_related;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReturnIndices_ofDuplicate_elements {

	public static void main(String[] args) {
		//Java program to return indices from both the array for duplicate elements

        int[] arr1={1,3,4,6,7};
        int[] arr2={6,4};
        
        Map<Integer,Integer> duplicatecheck=new HashMap<>();
        
        for(int i=0;i<arr1.length;i++)
        {
            duplicatecheck.put(arr1[i],i);
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(duplicatecheck.containsKey(arr2[i]))
            {
                System.out.println("The duplicate element indices: " +arr2[i] + " " + "Arr1 index: " + duplicatecheck.get(arr2[i])+ ","  + " " + "Arr2 index : " + i );
            }
        }
		
	}

}
