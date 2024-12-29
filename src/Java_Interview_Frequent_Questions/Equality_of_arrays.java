package Java_Interview_Frequent_Questions;

import java.util.Arrays;

public class Equality_of_arrays {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		int b[]={1,2,3,4,5};
		
		
//		logic 1 - Using array in-Built method
//		boolean status=Arrays.equals(a, b);
//		if(status==true)
//		{
//			System.out.println("Both the arrays are Equal");
//		}
//		else
//		{
//			System.out.println("Both the arrays are not equal");
//		}
		

		
//			logic 2 -using  logic
		int length1=a.length;
		int length2=b.length;
		boolean status=true;
		
		if(length1==length2)
		{
			for(int i=0;i<length1;i++)
			{
			    if(a[i]!=b[i]) 
			    {
			    	status=false;
			    }
			}
		}
		else
		{
			status=false;
		}
		if(status==true)
		{
			System.out.println("Both the arrays are equal..");
		}
		else
		{
			System.out.println("Both the arrays are not equal..");
		}

			
		
		}		
	}

