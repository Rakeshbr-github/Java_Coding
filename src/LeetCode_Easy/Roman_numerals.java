package LeetCode_Easy;

import java.util.HashMap;
import java.util.Map;

//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000

//Given a roman numeral, convert it to an integer.

public class Roman_numerals {

	
    public static int romanToInt(String s) {
        
        // Create a map to store Roman numeral values
 Map<Character, Integer> romanMap = new HashMap<>();
 romanMap.put('I', 1);
 romanMap.put('V', 5);
 romanMap.put('X', 10);
 romanMap.put('L', 50);
 romanMap.put('C', 100);
 romanMap.put('D', 500);
 romanMap.put('M', 1000);

 int total = 0; // Initialize the total value
 int prevValue = 0; // Store the value of the previous character

 // Traverse the Roman numeral string from right to left
 for (int i = s.length() - 1; i >= 0; i--) {
     char currentChar = s.charAt(i);
     int currentValue = romanMap.get(currentChar);

     // If the current value is less than the previous value, subtract it
     if (currentValue < prevValue) 
     {
         total = total-currentValue ;
     } 
     else 
     {
         // Otherwise, add it to the total
         total = total+currentValue;
     }

     // Update the previous value
     prevValue = currentValue;
 }

 return total;
}
	public static void main(String[] args) {

		System.out.println("Sucessfully executing program.....");
		System.out.println("");
		
		int result1=romanToInt("II");
		System.out.println(result1);
		int result2=romanToInt("LVIII");
		System.out.println(result2);
		int result3=romanToInt("MCMXCIV");
		System.out.println(result3);
		int result4=romanToInt("ICD");
		System.out.println(result4);


		
		System.out.println("");
		System.out.println("Sucessfully ran the Roman to Integer program!!!!");
            
		
	}

}
