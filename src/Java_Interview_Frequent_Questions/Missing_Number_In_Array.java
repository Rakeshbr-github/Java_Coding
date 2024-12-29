package Java_Interview_Frequent_Questions;

public class Missing_Number_In_Array {

	public static void main(String[] args) {

//		Array should not have duplicates if we want to check missing number
		int a[]= {1,2,3,4,5,7};
			int arrsize=a.length;
			int sum1=0;
			int sum2=0;
			int res;
			int arrlength=a.length;
			
			for(int i=0;i<arrlength;i++)
			{
				sum1= sum1+a[i];
				
			}
			for(int i=1;i<=7;i++)
			{
				sum2=sum2+i;
			}
			res=sum2-sum1;
			System.out.println(res + " is the missing number in the Array..");
			

		
		
		
	}

}
