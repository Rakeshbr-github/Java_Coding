package Java_Interview_Frequent_Questions;

import java.util.Arrays;

public class Second_smallest_largest_inArray {

	public static void main(String[] args) {
		
//		int a[]= {1,1,1};
		int a[]= {2,2,5,7,7,8,1,4,8};
		int arlength=a.length;
		
		Arrays.sort(a);
		
		
//		Logic 1 : when there are no duplicates
		System.out.println("Second smallest element in the given array is :" + a[1]);
		System.out.println("Second largest element in the given array is :" + a[arlength-2]);

//		Logic 2 : When there are duplicates
//		To find the second smallest
		int smallest=a[0];
		int secondsmallest=-1;
		for(int i=1;i<arlength;i++)
		{
			if(a[i]!=smallest)
			{
				secondsmallest=a[i];
				break;
			}
		}
		
//		To find the second largest
		int largest=a[arlength-1];
		int secondlargest=-1;
		for(int i=arlength-1;i>=0;i--)
		{
			if(a[i]!=largest)
			{
				secondlargest=a[i];
				break;
			}
		}
		
		
		if(secondsmallest==-1)
		{
			System.out.println("Second smallest element not found");
		}
		else
			System.out.println(secondsmallest + ": " + " is the second smallest element");
			
		
		if(secondlargest==-1)
		{
			System.out.println("Second largest element not found");
		}
		else
			System.out.println(secondlargest + ": " + " is the second largest element");
			

	}

}
