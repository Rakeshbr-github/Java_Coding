package String_Java_Programs;

public class Remove_whitespace_fromString {

	public static void main(String[] args) {

		String name="Rakesh Automated Ui And Api";
	    String[] s=name.split(" ");
	    String conc="";
	    for(String s1:s)
	    {
	    	conc=conc+s1;
	    }
	    System.out.println(conc);
		
	}

}
