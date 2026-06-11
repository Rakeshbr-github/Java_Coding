package Array_related;

import java.util.HashMap;
import java.util.Map;

public class ReturnIndices_ofDuplicate_elements {

	public static void main(String[] args) {
		//Java program to return indices from both the array for duplicate elements

        int[] a={1,3,4,6,7};
        int[] b={6,4};
        
//        Map<Integer,Integer> duplicatecheck=new HashMap<>();
//        for(int i=0;i<a.length;i++)
//        {
//            duplicatecheck.put(a[i],i);
//        }
//        for(int i=0;i<b.length;i++)
//        {
//            if(duplicatecheck.containsKey(b[i]))
//            {
//                System.out.println("The duplicate element indices: " +b[i] + " " + "Arr1 index: " + duplicatecheck.get(b[i])+ ","  + " " + "Arr2 index : " + i );
//            }
//        }

//        or

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    System.out.println(
                            "Element: " + a[i] +
                                    " Index in a: " + i +
                                    " Index in b: " + j
                    );
                }
            }
        }
	}

}
