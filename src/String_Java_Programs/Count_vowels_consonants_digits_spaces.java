package String_Java_Programs;

public class Count_vowels_consonants_digits_spaces {

	public static void main(String[] args) {
		
		String s="Rakesh Auto7mation 12";
		String lowerstring=s.toLowerCase();
		int vowels=0,consonants=0,digits=0,spaces=0;
		char[] stringchar=lowerstring.toCharArray();
		
////		Enhaced for loop
//		for(char c:stringchar)
//		{
//			if(c>='a' && c<='z') {
//			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
//			{
//				vowels++;
//			}
//			else {
//				consonants++;
//			}
//			}
//			
//			else if (c>='0' && c<='9')
//			{
//				digits++;
//			}
//			else if(c==' ')
//			{
//				spaces++;
//			}
//		}
		
		
//		Normal for loop
		for (int i=0;i<stringchar.length;i++)
		{
			
			if(stringchar[i]>='a' && stringchar[i]<='z') {
				if(stringchar[i]=='a' || stringchar[i]=='e' || stringchar[i]=='i' || stringchar[i]=='o' || stringchar[i]=='u')
				{
					vowels++;
				}
				else 
					consonants++;
				}
			else if (stringchar[i]>='0' && stringchar[i]<='9')
			{
				digits++;
			}
			else if(stringchar[i]==' ')
			{
				spaces++;
			}
			
		}
		System.out.println("The Number of vowels in given string are:" + vowels );
		System.out.println("The Number of consonants in given string are:" + consonants);
		System.out.println("The Number of digits in given string are:" + digits);
		System.out.println("The Number of spaces in given string are:" + spaces);
		

	}

}
