package Array_related;

import java.util.Arrays;

public class Second_smallest_largest_inArray {

	public static void main(String[] args) {
		
		int[] a={1,3,4,6,7,9,3,3,7};
		int arlength=a.length;
//		Arrays.sort(a);

		int secondsmallest=Integer.MAX_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<smallest)
			{
				secondsmallest=smallest;
				smallest=a[i];
			}
			else if(a[i]<secondsmallest && a[i]!=smallest)
			{
				secondsmallest=a[i];
			}
		}
		System.out.println(secondsmallest);



	}

}
