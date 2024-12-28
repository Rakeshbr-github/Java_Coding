package Java_Interview_Frequent_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonnaci_series {

	public static void main(String[] args) {

		
//		logic 1
//		int n1=0,n2=1,sum=0;
//	      System.out.print(n1 + " " + n2 );
//		for(int i=2;i<10;i++)
//		{
//			sum=n1+n2;
//			System.out.print(" " + sum);
//			n1=n2;
//			n2=sum;
//		}
		
		
		
//		logic 2 using arraylist conecpt
		ArrayList<Integer> arr = new ArrayList<>();  //<> is optional on the right hand side 
        for (int i = 0; i <= 10; i++) {
            if (i <= 1) {
                arr.add(i);       // arr[0,1]
            } else {
                int sum = arr.get(i - 1) + arr.get(i - 2);  //
                arr.add(sum);     // arr[0,1,1,2,3,5,8,13,21,34,55]
            }
        }
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
		
        
          
		}	
	}


