package Java_Interview_Frequent_Questions;

public class Remove_Junk_from_String {

	public static void main(String[] args) {

		String s="Rakesh../is;;;;a/.,testing'''expert*Automation";
		
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
	}

}
