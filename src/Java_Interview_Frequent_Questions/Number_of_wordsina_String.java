package Java_Interview_Frequent_Questions;

import java.util.Scanner;

public class Number_of_wordsina_String {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value...");
		String s=sc.nextLine();
		int stringen=s.length();
		int count=1;
		
		for(int i=0;i<=stringen-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println("Number of words in a given String are : " + count);
	}

}
