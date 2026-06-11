package String_Java_Programs;

public class HalfStringrev_append {

	public static void main(String[] args) {
		// Java program to rev half of the given string and append it back with the main string
		
		String s1="Rakeshbr";
		String rev1="";
		String rev2="";
		String result="";
		
		int stringlength=s1.length();
		int  mid=stringlength/2;
		System.out.println(stringlength);
//		System.out.println(mid);
		
		for(int i=mid-1;i>=0;i--)
		{

			rev1=rev1+s1.charAt(i);
		}
		for(int i=mid;i<stringlength;i++)
		{

			rev2=rev2+s1.charAt(i);
		}
		result=rev1+rev2;
		System.out.println("The result string with rev of half of the string : "+result);
	}

}
