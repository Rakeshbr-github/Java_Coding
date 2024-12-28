package Java_Interview_Frequent_Questions;

public class Sum_Of_Numbers_in_Array {

	public static void main(String[] args) {

		int a[]= {1,2,3,4};
		int sum=0;
		
//		Normal for loop
//		for(int i=0;i<=3;i++)
//		{
//			sum=sum+a[i];
//		}
//		System.out.println(sum +" is a sum of numbers in the array");
		
//		Enhanced for loop
		for(int r:a)
		{
			sum=sum+r;
		}
		System.out.println(sum +" is a sum of numbers in the array");
		
	}

}
