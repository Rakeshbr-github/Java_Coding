package Array_related;

import java.util.Arrays;

public class CompareArrayindexes_storeMatchingElements {

	public static void main(String[] args) {
		  int[] a= {1,4,5,7};
		  int[] b= {6,4,3,7};
		 int[] c= CompStoreMatchingElements(a,b);
		 System.out.println(Arrays.toString(c));

	}
//	logic method to compare indexes elements 
	private static int[] CompStoreMatchingElements(int[] a, int[] b) {
		 int count=0;
		// Step 1: Count matching index elements
           for(int i=0;i<a.length;i++)
           {
        	   if(a[i]==b[i])
        	   {
        		   count++;
        	   }
           }
        // Step 2: Store matching elements
		int[] c=new int[count];
		int k=0;
   		for(int i=0;i<a.length;i++)
   		{
     	   if(a[i]==b[i])
     	   {
     		  c[k++]=a[i];
     	   }
   		}
		
		
		return c;
	}

}
