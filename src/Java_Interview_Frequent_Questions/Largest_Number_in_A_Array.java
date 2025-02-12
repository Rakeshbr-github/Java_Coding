package Java_Interview_Frequent_Questions;

public class Largest_Number_in_A_Array {

	public static void main(String[] args) {

		int[] arr= {1,3,4};
		int largest = arr[0];
		for(int i=1;i<=arr.length-1;i++ )
		{
			if(largest<arr[i])
			{
				largest=arr[i];
				
			}
		}
		System.out.println(largest + " " + "is the highest number in the array");

		
	}

}
