package Java_Interview_Frequent_Questions;

public class Print_even_odd_in_Array {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6};
		
//		for(int i=0;i<=5;i++)
//		{
//			if(a[i]%2==0)
//			{
//				System.out.println(a[i] + " is a even number");
//			}
//			else
//			{
//				System.out.println(a[i] + " is a odd number");
//			}
//		}
		
//		to print odd and even separately
		
		System.out.println("Even numbers are...");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Odd numbers are...");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			System.out.print(a[i] + " ");
		}
		
		
		
	}

}
