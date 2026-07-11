package String_Java_Programs;

public class Numberof_occurences_ofa_character_in_string {

	public static void main(String[] args) {

		String s="Rakesh    Automation  testeR";
		int s1=s.length();
		int s2=s.replaceAll("R", "").length();
		int count=s1-s2;
		System.out.println("Number of occurences of character r is :" + count);
		
	}

}
