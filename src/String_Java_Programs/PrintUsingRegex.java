package String_Java_Programs;

import java.util.regex.*;

public class PrintUsingRegex {

    public static void main(String[] args) {

        //\\$\\d+\\.\\d+|\\d+ // this is logic
//\\$ → Matches the literal $
//\\d+ → One or more digits
//\\. → Matches the decimal point .
//\\d+ → Digits after the decimal
//| → OR
//\\d+ → Matches a whole number



        String s = "Order 123 and total is $456.78";
//        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d+|\\d+");
//        Matcher matcher = pattern.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

//Without regex pattern
        printdigitsasis(s);
    }
    public static void printdigitsasis(String s)
    {
        StringBuilder temp=new StringBuilder();
        StringBuilder res=new StringBuilder();
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(Character.isDigit(c[i]) || c[i]=='.' || c[i]=='$')
            {
                temp.append(c[i]);
            }
            else
            {
                if(temp.length()>0)
                {
                    res.append(temp);
                    if(res.length()>0)
                    {
                        res.append(",");
                        temp.setLength(0);
                    }
                }
            }
        }
        if(temp.length()>0)
        {
            res.append(temp) ;
        }

        System.out.println(res);

    }
}









