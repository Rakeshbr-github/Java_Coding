package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_String {

    public static boolean isAnagram(String s, String t)
    {
    	
    	char[] one=s.toCharArray();
		char[] two=t.toCharArray();
		

		
		if(one.length==two.length)
		{
			Arrays.sort(one);
			Arrays.sort(two);
			for(int i=0;i<one.length;i++)
			{
				if(one[i]!=two[i]) 
				{
					return false;
				}
			}
		}
		else
		{
			return false ;
		}
		return true;
    	
    }

	
	
	public static void main(String[] args) {
		
                        
		System.out.println("Enter the String to check if its a Anagram or not");
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		String String1=sc1.next();
		String String2=sc2.next();
		isAnagram(String1,String2);
		boolean result=isAnagram(String1,String2);
		System.out.println(result);


		
	}

}
