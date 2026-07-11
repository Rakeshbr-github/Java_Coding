package String_Java_Programs;

import java.util.Scanner;

public class Number_of_wordsina_String {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String...");
		String input=sc.nextLine();
		int count=0;
		StringBuilder res=new StringBuilder();
		for(int i=0;i<=input.length()-1;i++)
		{
			if(input.charAt(i)!=' ')
			{
				res.append(input.charAt(i));
			}
			else if(res.length()>0)
			{
				System.out.print(res + ",");
				count++;
				res.setLength(0);
			}
		}
		if(res.length()>0)
		{
			System.out.print(res);
			count++;
		}
		System.out.println();
		System.out.println("Number of words in the given String are:" + count);
	}

}
