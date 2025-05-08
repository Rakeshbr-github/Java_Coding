package LeetCode_Easy;

public class Panlindrome_Number {
	 public static boolean isPalindrome(int x) {
	        
	        int actual_num=x;
	        int rev=0;
	        
	         if(x<0)
	         {
	            return false;
	         }
	        if(x>0)
	        {
	         while(x!=0)
	         {
	            rev=rev*10 + x%10;
	            x=x/10;
	         }
	        }

	      return actual_num==rev;
	       
	    }
	
	
	public static void main(String[] args) {
 
		boolean result1=isPalindrome(121);
		System.out.println(result1);
		boolean result2=isPalindrome(-121);
		System.out.println(result2);
		boolean result3=isPalindrome(10);
		System.out.println(result3);
		
		
		
		
		
		
	}

}
