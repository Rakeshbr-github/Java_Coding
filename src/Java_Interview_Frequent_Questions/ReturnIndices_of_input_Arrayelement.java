package Java_Interview_Frequent_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnIndices_of_input_Arrayelement {

	public static ArrayList<Integer> indiciesmeth(int a[],int target)
	{
		ArrayList<Integer> indices=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(target==a[i]) {
				indices.add(i);
			}
		}
		return indices;
	}
	
	public static void main(String[] args) {
		
		int a[]= {3,4,5,3,6,3,3,3};
		int arraylenght=a.length;
		System.out.println("Enter the Number....");
		Scanner sc=new Scanner(System.in);
		int target =sc.nextInt();
		System.out.println(indiciesmeth(a,target).toString());

	}

}
