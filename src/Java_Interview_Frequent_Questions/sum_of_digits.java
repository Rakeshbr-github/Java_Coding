package Java_Interview_Frequent_Questions;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number..");
		int num=sc.nextInt();
		int sum=0,res=0;
		
		while(num!=0)
		{
			sum=num%10;
			res=res+sum;
			num=num/10;
		}
		System.out.println("sum of the given number is " + res);
		
	}

}
