package Java_Interview_Frequent_Questions;

import java.util.Scanner;

public class Largest_of_3_numbers {

	public static void main(String[] args) {

	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enters the numbers...");
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   int c=sc.nextInt();
	   
//	   if(a>b&&a>c)
//	   {
//		   System.out.println(a +" is greatest of three numbers");
//	   }
//	   else if(b>a&&b>c)
//	   {
//		   System.out.println(b +" is greatest of three numbers");
//	   }
//	   else
//	   {
//		   System.out.println(c +" is greatest of three numbers");
//	   }
	   
	   
	   int largest1=a>b?a:b;   //gives largest of a & b
	   int largest2=c>largest1?c:largest1;   //gives largest of c & largest1
	   System.out.println(largest2 + " is the largest  number");
	   
	   
		
	}

}
