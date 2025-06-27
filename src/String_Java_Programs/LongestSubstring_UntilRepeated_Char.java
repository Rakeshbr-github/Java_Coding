package String_Java_Programs;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring_UntilRepeated_Char {

	public static void main(String[] args) {
		String s1="Average";
		String s2=s1.toLowerCase();
		String result1=longestString(s2);
		System.out.println(result1);
	}
	
	public static String longestString(String input)
	{
		Set<Character> seen=new HashSet<>();
		StringBuilder result=new StringBuilder();
		char[] resultchars=input.toCharArray();
		for(int i=0;i<=resultchars.length-1;i++)
		{
			 if(seen.contains(resultchars[i]))
			 {
				 break;
			 }
			 else
			 {
				 seen.add(resultchars[i]);
				 result.append(resultchars[i]);
			 }
		}
		return result.toString();
	}

}
