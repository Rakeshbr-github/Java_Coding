package Java_Interview_Frequent_Questions;

//Prime number
//1)If the number>1
//2)If number is divisible by 1 or itself only

import java.util.Scanner;

public class Check_prime_number_or_not {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number..");
		int num=sc.nextInt();
		int count=0;
		
		if(num>0)
		{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
			 if(count==2)
			{
				System.out.println(num +" is a prime number "); 
			}
			else
			{
				System.out.println(num + " Not a Prime number");
			}
		}

		}
		
		
	}


