package Java_Interview_Frequent_Questions;

import java.util.Scanner;

public class Even_and_odd_in_a_number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
     	int even_count=0;
		int odd_count=0;
		int rem=0;

		
		while(num!=0) 
		{
			rem=num%10;
		
			if(rem%2==0)
			{
				even_count++;
			}
			else	
			{
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("COUNT of even numbers"+ even_count);
		System.out.println("COUNT of odd numbers"+ odd_count);

		
		
		

		
	}

}
