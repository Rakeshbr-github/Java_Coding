package String_Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_charin_String {

	public static void main(String[] args) {
		
		String name="Rakkesh";
		char[] charstring=name.toCharArray();
		Map<Character, Integer> charcount=new HashMap<>();
//		Using normal enhanced for loop
		for(char c:charstring)
		{
			charcount.put(c, charcount.getOrDefault(c, 0)+1);
		}
		
////		Using normal for loop 
//		for(int i = 0; i < charstring.length; i++)
//		{
//			char c = charstring[i];
//			charcount.put(c, charcount.getOrDefault(c, 0) + 1);
//		}
		
		for(Map.Entry<Character, Integer> entry:charcount.entrySet())
		{
			if(entry.getValue()>1)
			{
			System.out.println(entry.getKey() + ":" +  entry.getValue());
			}
		}

	}

}
