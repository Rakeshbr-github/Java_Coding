package Java_Interview_Frequent_Questions;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number....");
		int mynum=sc.nextInt();   
        int org_num= mynum;
        int rev=0;
        
		 while(mynum!=0)
		 {
			 rev=rev*10 + mynum%10;
			 mynum=mynum/10;
		 }
		 
		 System.out.println("The reverse number is "+ rev);
		
		 if(org_num==rev)
		 {
			 System.out.println("Given number is a palindrome number");
		 }
		 else
		 {
			 System.out.println("Given number is not palindrome");
		 }
	}

}
