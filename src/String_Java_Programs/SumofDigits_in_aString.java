package String_Java_Programs;

public class SumofDigits_in_aString {

	public static void main(String[] args) {

           String s="Rakesh123";
           char[] stringarr=s.toCharArray();
           int sum=0;
           for(int i=0;i<stringarr.length;i++)
           {
        	 char currchar= stringarr[i];
        	 if(Character.isDigit(currchar))
        	 {
        		 int numericvalue=Character.getNumericValue(currchar); //to convert ASCII value to number 
        		 sum=sum+numericvalue;
        	 }
           }
           System.out.println("Sum of the digits in the given String is:" + sum);

	}

}
