package Java_Interview_Frequent_Questions;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number..");
		 int num=sc.nextInt();
		 int org_num=num;
		 int fact=1;
				
		 for(int i=1;i<=num;i++)
		 {
			 fact=fact*i;
		 }

	System.out.println(fact + " is the factorial of " + org_num);

		
		
	}

}
