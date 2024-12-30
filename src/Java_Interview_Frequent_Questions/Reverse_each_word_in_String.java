package Java_Interview_Frequent_Questions;

public class Reverse_each_word_in_String {

	public static void main(String[] args) {

		String str="Welcome to java";
		
		  String[] words=str.split(" "); //it will split the words and store in array
		  String Reversestring="";
	
		  
		  for(String w:words)
		  {
			  String reverseword="";
			  for(int i=w.length()-1;i>=00;i--)
			  {
				  reverseword=reverseword+w.charAt(i);
			  }
			  Reversestring=Reversestring+ " " + reverseword;
		  }
		  System.out.println("The reverse of a string is :" + Reversestring );
 		
	}

}
