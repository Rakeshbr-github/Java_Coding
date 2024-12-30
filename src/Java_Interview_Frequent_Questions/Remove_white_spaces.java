package Java_Interview_Frequent_Questions;

public class Remove_white_spaces {

	public static void main(String[] args) {

		String s="Rakesh    Automation  tester";
		
		String s1=s.replaceAll("\\s", "");
		System.out.println(s1);
		
	}

}
