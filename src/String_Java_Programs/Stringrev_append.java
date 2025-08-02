package String_Java_Programs;

public class Stringrev_append {

	public static void main(String[] args) {
		// Java program to rev half of the given string and append it back with the main string
		
		String s1="Rakeshb";
		String rev1="";
		String rev2="";
		String result="";
		
		int stringlength=s1.length();
		int  mid=stringlength/2;
		System.out.println(stringlength);
//		System.out.println(mid);
		
		for(int i=mid-1;i>=0;i--)
		{
			char reqstring1=s1.charAt(i);
			rev1=rev1+reqstring1;
		}
		for(int i=mid;i<stringlength;i++)
		{
			char reqstring2=s1.charAt(i);
			rev2=rev2+reqstring2;
		}
		System.out.println(rev1);
		System.out.println(rev2);
		result=rev1+rev2;
		System.out.println("The result string with rev of half of the string : "+result);
	}

}
