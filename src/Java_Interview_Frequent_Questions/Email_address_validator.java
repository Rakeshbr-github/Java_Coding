package Java_Interview_Frequent_Questions;
 
public class Email_address_validator {
 static int namelentgh;
 static int domainlength;
	public static  boolean name(int name)
	{
	     if(name<10 & name>5)
	     {
	    	 return true;
	     }
	     else
	    	 return false;
	}
	
		public static  boolean domain(int domain)
		{
		     if(domain<9 & domain>4)
		     {
		    	 return true;
		     }
		     else
		    	 return false;
		}
		
	
	public static void main(String[] args) {
		  
		String mymail="rakeshgow@gmail.co";
		String[] splictaddress=mymail.split("@");
	     int namelentgh=splictaddress[0].length();
	     int domainlength=splictaddress[1].length();
	     System.out.println(name(namelentgh));
	     System.out.println(domain(domainlength));
 
	}
 
}