package Array_related;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxElement_AdjacentArrayElement {

	public static void main(String[] args) {
				
		int[] a= {1,4,8,15,17}; //3,4,7,2
		int diff=0;
		int[] b=new int[a.length-1];
		
		for(int i=0;i<a.length-1;i++)
		{
			b[i]=a[i+1]-a[i]; 
		    if(b[i]>diff){
		    	diff=b[i];
		    }
     
		}
		System.out.println("Maximum difference element of the adjacent array elements are:" + diff);
        System.out.println(Arrays.toString(b));
	}

}
