package Java_Interview_Frequent_Questions;

import java.util.Scanner;

public class Reversing_A_Number {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		 int user_input =sc.nextInt();  //ex- 1234
		 
//		 1)Using algorithm
		 int rev=0;
		 while(user_input!=0)
		 {
			 rev=rev*10 + user_input%10;
			 user_input=user_input/10;
		 }
		 System.out.println("The reverse number is "+ rev);
		 
//		 2)Using StringBuffer or StringBuilder we can reverse by calling reverse method
		 
		 
		 
		  
		
	}

}
