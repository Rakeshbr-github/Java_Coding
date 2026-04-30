package String_Java_Programs;

public class CharacterFrequencyInSequence {


    public static void main(String[] args) {

        String s1 = "aabaaacccbb";
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s1.length() - 1; i++)
        {
            if(s1.charAt(i)==s1.charAt(i+1))
            {
                count++;
            }
            else {
                result.append(s1.charAt(i)).append(count);
                count=1;
            }
        }
        result.append(s1.charAt(s1.length()-1)).append(count);
       System.out.println(result);
    }
}
