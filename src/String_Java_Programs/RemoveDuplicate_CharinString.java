package String_Java_Programs;

import java.util.LinkedHashSet;

public class RemoveDuplicate_CharinString {

    public static void main(String args[])
    {
        String s="Rakesh is a Automation tester";
        String s1=s.toLowerCase();
        String result =remvoeduplicates(s1);
        System.out.println(result);

    }
    public static String remvoeduplicates(String s)
    {
        char[] c=s.toCharArray();
        LinkedHashSet<Character> setofStrings=new LinkedHashSet<>();
        for(char ch:c)
        {
            if(ch!=' ') {
                setofStrings.add(ch);
            }
        }
        return setofStrings.toString();
    }
}

////or as below
//
//class Main {
//    public static void main(String[] args) {
//        String s="Rakesh is a Automation tester";
//        String s1=s.toLowerCase();
//        char[] c=s1.toCharArray();
//        Map<Character,Integer> duplicates=new HashMap<>();
//        for(char ch:c)
//        {
//            duplicates.put(ch, duplicates.getOrDefault(ch,0)+1);
//        }
//        for(Map.Entry<Character,Integer> entry:duplicates.entrySet())
//        {
//            if(entry.getValue()<2)
//            {
//                System.out.print(entry.getKey());
//            }
//
//        }
//
//
//    }