package LeetCode_Easy;

public class Two_Sum {

	  public static  int[] returnnums(int[] nums,int target)
	  {
		  for(int i=0;i<nums.length;i++)
		  {
			  for(int j=i+1;j<nums.length;j++)
			  {
				  if(nums[i]+nums[j]==target)
				  {
					  return new int[] {i,j};
					  
				  }
			  }
		  }
	        throw new IllegalArgumentException("No two numbers add up to the target.");

	  }
	public static void main(String[] args) {
		
		int[] a= {1,2,3,9,8,8,9};
		int target=18;
		int[] result=returnnums(a,target);//array
		  System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
  
		
	}

}
