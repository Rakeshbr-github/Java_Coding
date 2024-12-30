package Java_Interview_Frequent_Questions;

import java.util.Arrays;

public class Bubble_sort {

	public static void main(String[] args) {

		
		int a[]= {4,2,3,1,7,8};
		int n=a.length;
		
		System.out.println("Before sorting" + Arrays.toString(a));
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1]) 
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}				
			}
		}
		System.out.println("After sorting" + Arrays.toString(a));
		
	}

}
