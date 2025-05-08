package Java_Interview_Frequent_Questions;

public class SumOfNumber_in_String {

	public static void main(String[] args) {

        String s1 = "i998";
        int sum = 0;
        char[] strarr = s1.toCharArray();

        for (char c : strarr) {
            if (Character.isDigit(c)) {
                sum =sum+ Character.getNumericValue(c);
            } else {
                System.out.println( c + " " + "is Not an integer: " );
            }
        }

        System.out.println("Sum of integers in the given string is " + sum);
	}

}
