package String_Java_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Nonrepeated_char {

    public static void main(String[] args)
    {

        String s="Rakeshaakkrr";
        String s1=s.toLowerCase();

        Map<Character,Integer> result=new LinkedHashMap<>();
// 		Set<String> res=new LinkedHashSet<>();

        for(char c:s1.toCharArray())
        {
            result.put(c,result.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:result.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey() + " is the first repeated character ");
                break;
            }
        }
    }
}
