package Java_Interview_Frequent_Questions;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string vaue..");
		String name=sc.next();
		int string_length=name.length();
		System.out.println(string_length);
		String compstring=name;
		String rev="";
		
		for(int i=string_length-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		if(compstring.equals(rev))
		{
			System.out.println("give string is a palindrome string");
		}
		else
		{
			System.out.println("give string is a not palindrome string");
		}
		
	}

}
