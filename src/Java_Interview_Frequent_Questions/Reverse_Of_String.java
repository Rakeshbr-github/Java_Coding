package Java_Interview_Frequent_Questions;

public class Reverse_Of_String {

	public static void main(String[] args) {

		String name="Rakesh";
		String rev="";
	    int length=name.length();
		System.out.println("Length of a String is " + length);
	    System.out.println("Before reversing a string " + name);
		
//		1)Using + operator ( string concatenation)
//		for(int i=length-1;i>=0;i-- )
//		{
//			rev=rev+name.charAt(i);
//		}
//		 System.out.println("After reversing a string "+ rev);
		
		
//		2)Using character array concept
		 char a[]=name.toCharArray();
		 for(int i=length-1;i>=0;i--)
		 {
			 rev=rev+a[i];
		 }
		 System.out.println("After reversing a string "+ rev);
		       
		
		
	}

}
