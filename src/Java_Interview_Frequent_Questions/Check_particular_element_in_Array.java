package Java_Interview_Frequent_Questions;

import java.util.Scanner;

public class Check_particular_element_in_Array {

	public static void main(String[] args) {

		int a[]= {1,2,5,6,7};
		int len=a.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number...");
		int user_num=sc.nextInt();
		boolean flag=false;
		
		for(int i=0;i<len;i++)
		{
			if(user_num==a[i])
			{
				System.out.println( a[i] + " Element found");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found..");

		}


		
	}

}
